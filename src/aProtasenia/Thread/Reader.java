package src.aProtasenia.Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader implements Runnable{
    Book book1 = new Book("First Book", "Library", false);
    Book book2 = new Book("Second Book", "Home", false);
    Book book3 = new Book("Third Book", "Home", false);
    List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3));

    @Override
    public void run() {
        Book book = bookList.get((int) (Math.random() * 3));
        while (book.isUse()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Wait the book: " + book.getBook());
                try {
                    Thread.currentThread().join(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        book.setUse(true);
        System.out.println(Thread.currentThread().getName() + " Booked: " + book.getBook());
        if (book.getArea().equals("Home")) {
            try {
                Thread.currentThread().join(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (book.getArea().equals("hall")) {
            try {
                Thread.currentThread().join(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        book.setUse(false);
        run();
    }
}
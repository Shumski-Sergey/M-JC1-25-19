package dSankovsky.Threads.A1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookReader implements Runnable {
    Book book1 = new Book("First Book", "hall", false);
    Book book2 = new Book("Second Book", "home", false);
    Book book3 = new Book("Third Book", "home", false);
    List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3));

    @Override
    public void run() {
        Book book = bookList.get((int) (Math.random() * 3));
        while (book.isOnHands()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Wait the book: " + book.getBookName());
                try {
                    Thread.currentThread().join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        book.setOnHands(true);
        System.out.println(Thread.currentThread().getName() + " Booked: " + book.getBookName());
        if (book.getReadArea().equals("home")) {
            try {
                Thread.currentThread().join(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (book.getReadArea().equals("hall")) {
            try {
                Thread.currentThread().join(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        book.setOnHands(false);
        run();
    }


   /* public void BookHolder(Book book) throws InterruptedException {
            while (book.isOnHands()) {
                synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Wait the book: " + book.getBookName());
                Thread.currentThread().join(2500);
            }
        }
        book.setOnHands(true);
        System.out.println(Thread.currentThread().getName() + " Booked: " + book.getBookName());
        Thread.currentThread().join(5000);
        book.setOnHands(false);
        BookHolder(bookList.get((int) (Math.random() * 3)));
    }*/
}


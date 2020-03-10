package aProtasenia.Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader implements Runnable {
    private LibraryBook book1 = new LibraryBook("Lord Of The Rings", "library", false);
    private LibraryBook book2 = new LibraryBook("Head Java", "home", false);
    private LibraryBook book3 = new LibraryBook("Clean Code", "home", false);
    private List<LibraryBook> libraryList = new ArrayList<>(Arrays.asList(book1, book2, book3));

    @Override
    public void run() {
        LibraryBook book = libraryList.get((int) (Math.random() * 3));
        while (book.isHands()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Wait the book: " + book.getBook());
                try {
                    Thread.currentThread().join(1400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        book.setHands(true);
        System.out.println(Thread.currentThread().getName() + " Booked up: " + book.getBook());
        if (book.getReadArea().equals("home")) {
            try {
                Thread.currentThread().join(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (book.getReadArea().equals("library")) {
            try {
                Thread.currentThread().join(4200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        book.setHands(false);
        run();
    }

}

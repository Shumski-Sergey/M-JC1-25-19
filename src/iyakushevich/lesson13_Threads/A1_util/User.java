package iyakushevich.lesson13_Threads.A1_util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User implements Runnable {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001b[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    Books book1 = new Books("book 1");
    Books book2 = new Books("book 2");
    Books book3 = new Books("book 3");
    List<Books> booksList = new ArrayList<>(Arrays.asList(book1, book2, book3));

    @Override
    public void run() {
        Books randomBook = booksList.get((int) (Math.random() * 3));
        takeBook(randomBook);
        returnBook(randomBook);
        run();
    }

    private void takeBook(Books randomBook) {
        while (randomBook.isOnHands()) {
            synchronized (this) {
                System.out.println(ANSI_YELLOW + Thread.currentThread().getName() + " запрашивает книгу " +
                        randomBook.getBookName() + ". Книга занята..." + ANSI_RESET);
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(ANSI_CYAN + Thread.currentThread().getName() + " читает книгу " +
                randomBook.getBookName() + ANSI_RESET);
        randomBook.setOnHands(true);
        try {
            Thread.sleep((int) (Math.random() * 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void returnBook(Books randomBook) {
        synchronized (this) {
            randomBook.setOnHands(false);
            this.notifyAll();
            System.out.println(ANSI_RED + Thread.currentThread().getName() + " вернул книгу " +
                    randomBook.getBookName() + ANSI_RESET);
        }
    }
}

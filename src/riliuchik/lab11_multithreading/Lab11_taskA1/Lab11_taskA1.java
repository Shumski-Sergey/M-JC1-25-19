package riliuchik.lab11_multithreading.Lab11_taskA1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

//разобраться с задачей

/**
 * Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 * Некоторые из них можна выдавать на руки некоторые только в читальный зал.
 * Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
 */

/**public class Lab11_taskA1 {
    private static ArrayList<Library> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(new Library("\"Шантарам\"", true, true));
        books.add(new Library("\"Мастер и Маргарита\"", false, true));
        books.add(new Library("\"Три товарища\"", true, true));
        books.add(new Library("\"Цветы для Элджернона\"", false, true));
        books.add(new Library("\"Над пропастью во ржи\"", true, true));
        books.add(new Library("\"Портрет Дориана Грея\"", false, true));

        startService("Иванов");
        startService("Смирнов");
    }

    public static class Library {
        private String nameOfReader;
        private String nameOfBook;
        private boolean opportunityToTakeHome;
        private boolean availability;

        public Library(String nameOfBook, boolean opportunityToTakeHome, boolean availability) {
            this.nameOfBook = nameOfBook;
            this.opportunityToTakeHome = opportunityToTakeHome;
            this.availability = availability;
        }

        public String getNameOfReader() {
            return nameOfReader;
        }

        public void setNameOfReader(String nameOfReader) {
            this.nameOfReader = nameOfReader;
        }

        public String getNameOfBook() {
            return nameOfBook;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }
    }

    static void startService(String nameOfReader) {
        Thread attendance = new Thread(new Reader(nameOfReader));
        attendance.start();
    }

    public static class Reader implements Runnable {
        String nameOfReader;
        public final int TIME_TO_TAKE_IN_READING_ROOM = 3000;
        public final int TIME_TO_TAKE_HOME = 5000;

        public Reader(String nameOfReader) {
            this.nameOfReader = nameOfReader;
        }

        public void run() {
            Library bookForCheck = books.get(ThreadLocalRandom.current().nextInt(books.size()));
            bookForCheck.setAvailability(false);
            bookForCheck.setNameOfReader(nameOfReader);
            while (!bookForCheck.availability) {
                if (bookForCheck.opportunityToTakeHome) {
                    try {
                        System.out.println(bookForCheck.getNameOfReader() + " взял " + bookForCheck.getNameOfBook() + " домой");
                        Thread.sleep(TIME_TO_TAKE_HOME);
                        System.out.println(bookForCheck.getNameOfReader() + " вернул " + bookForCheck.getNameOfBook());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        System.out.println(bookForCheck.getNameOfReader() + " взял " + bookForCheck.getNameOfBook() + " в читальный зал");
                        Thread.sleep(TIME_TO_TAKE_IN_READING_ROOM);
                        System.out.println(bookForCheck.getNameOfReader() + " вернул " + bookForCheck.getNameOfBook());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            bookForCheck.setAvailability(true);
        }
    }
}*/
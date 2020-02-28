package riliuchik.lab11_multithreading.Lab11_taskA1;

import static riliuchik.lab11_multithreading.Lab11_taskA1.Main.books;
import static riliuchik.lab11_multithreading.Lab11_taskA1.Utils.*;

public class Service {
    static void startService(String nameOfReader) {
        new Thread(new Reader(nameOfReader)).start();
    }

    static class Reader implements Runnable {
        String nameOfReader;
        final int MIN_OF_BOOKS = 1;
        final int MAX_OF_BOOKS = 3;
        final int TIME_TO_TAKE_IN_THE_READING_ROOM = 3000;
        final int TIME_TO_TAKE_HOME = 10000;

        public Reader(String nameOfReader) {
            this.nameOfReader = nameOfReader;
        }

        public void run() {
            int amountOfBooks = getRandomAmount(MIN_OF_BOOKS, MAX_OF_BOOKS);
            for (int i = 1; i <= amountOfBooks; i++) {
                Library currentBook = books.get(getRandomBook(books));
                System.out.println(nameOfReader + " уточняет статус книги " + currentBook.getNameOfBook());

                if (currentBook.getStatus() == Status.IN_THE_READING_ROOM) {
                    System.out.println(nameOfReader + ", извините, но " + currentBook.getNameOfReader() + " взял " + currentBook.getNameOfBook() + " в читальный зал");
                }

                if (currentBook.getStatus() == Status.AT_HOME) {
                    System.out.println(nameOfReader + ", извините, но " + currentBook.getNameOfReader() + " взял " + currentBook.getNameOfBook() + " домой");
                }

                if (currentBook.getStatus() == Status.AVAILABLE) {
                    if (currentBook.getStatus() == Status.AVAILABLE) {
                        if (currentBook.isAvailableToTakeInTheReadingRoom()) {
                            synchronized (books) {
                                takeToTheReadingRoom(currentBook);
                            }
                            try {
                                Thread.sleep(TIME_TO_TAKE_IN_THE_READING_ROOM);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            synchronized (books) {
                                returnBack(currentBook);
                            }
                        } else if (currentBook.isAvailableToTakeHome()) {
                            try {
                                synchronized (books) {
                                    takeHome(currentBook);
                                }
                                Thread.sleep(TIME_TO_TAKE_HOME);
                                synchronized (books) {
                                    returnBack(currentBook);
                                }
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        public void takeToTheReadingRoom(Library bookForCheck) {
            bookForCheck.status = Status.IN_THE_READING_ROOM;
            bookForCheck.setNameOfReader(nameOfReader);
            System.out.println(nameOfReader + " взял " + bookForCheck.getNameOfBook() + " в читальный зал");
        }

        public void takeHome(Library bookForCheck) {
            bookForCheck.status = Status.AT_HOME;
            bookForCheck.setNameOfReader(nameOfReader);
            System.out.println(nameOfReader + " взял " + bookForCheck.getNameOfBook() + " домой");
        }

        public void returnBack(Library bookForCheck) {
            bookForCheck.status = Status.AVAILABLE;
            bookForCheck.setNameOfReader(null);
            System.out.println(nameOfReader + " вернул " + bookForCheck.getNameOfBook());
        }
    }
}
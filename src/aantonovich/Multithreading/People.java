package aantonovich.Multithreading;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class People implements Runnable {

    private static final int NUMBER_OF_VISITORS = 5;
    public String peopleName;
    private List<Books> booksLibrary;
    private static final Random random = new Random();
    private Queue<People> people = new ConcurrentLinkedQueue<>();

    public People(String peopleName, List<Books> booksLibrary) {
        this.peopleName = peopleName;
        this.booksLibrary = booksLibrary;
    }


    public String getPeopleName() {
        return peopleName;
    }

    public List<Books> getBooksLibrary() {
        return booksLibrary;
    }

    public Queue<People> getPeople() {
        return people;
    }

    public void setPeople (Queue<People> people) {
        this.people = people;
    }

        private void getBookForReading () {
     //   Books books = new Books(int timeForReading, boolean onlyReadingRoom, boolean onHand);
            if (booksLibrary.size() > 0) {
                int indexBook = random.nextInt(booksLibrary.size());
                int i = 0;
                for (Books bookChose : booksLibrary) {
                    if (i == indexBook) {
                //        books = bookChose;
                        break;
                    }
                    i++;
                }
            }
        }


    @Override
    public void run() {



    }
}
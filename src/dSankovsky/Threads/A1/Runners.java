package dSankovsky.Threads.A1;

public class Runners {
    public static void main(String[] args) {
        BookReader bookReader = new BookReader();

        Thread reader1 = new Thread(bookReader);
        Thread reader2 = new Thread(bookReader);
        Thread reader3 = new Thread(bookReader);
        reader1.start();
        reader2.start();
        reader3.start();

    }
}

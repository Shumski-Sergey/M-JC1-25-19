package aProtasenia.Thread;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();

        Thread reader1 = new Thread(reader);
        Thread reader2 = new Thread(reader);
        Thread reader3 = new Thread(reader);
        reader1.start();
        reader2.start();
        reader3.start();
    }
}

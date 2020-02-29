package src.aProtasenia.Thread;
/*Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
Некоторые из них можна выдавать на руки некоторые только в читальный зал.
Посетители могут брать одновременно по несколько книг на руки и в читальный зал*/

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

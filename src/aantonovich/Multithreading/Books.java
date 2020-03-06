package aantonovich.Multithreading;

//  Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
//  Некоторые из них можно выдавать на руки некоторые только в читальный зал.
//  Посетители могут брать одновременно по несколько книг на руки и в читальный зал

public class Books {

    private String bookName;
    private int timeForReading ;
    private boolean onlyReadingRoom ;
    private boolean onHand;

    public Books (String bookName, int timeForReading, boolean onlyReadingRoom, boolean onHand){

        this.bookName = bookName;
        this.timeForReading = timeForReading;
        this.onlyReadingRoom = onlyReadingRoom;
        this.onHand = onHand;
    }

    public String getBookName() {
        return bookName;
    }

    public int getTimeForReading() {
        return timeForReading;
    }

    public boolean isOnlyReadingRoom() {
        return onlyReadingRoom;
    }

    public boolean isOnHand() { return onHand; }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setTimeForReading(int timeForReading) {
        this.timeForReading = timeForReading;
    }

    public void setOnlyReadingRoom(boolean onlyReadingRoom) {
        this.onlyReadingRoom = onlyReadingRoom;
    }

    public void setOnHand(boolean onHand) { this.onHand = onHand; }
}



package dSankovsky.Threads.A1;

public class Book {
    private String bookName;
    private boolean onHands;
    private String readArea;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isOnHands() {
        return onHands;
    }

    public void setOnHands(boolean onHands) {
        this.onHands = onHands;
    }

    public String getReadArea() {
        return readArea;
    }

    public void setReadArea(String readArea) {
        this.readArea = readArea;
    }
    public Book(String bookName, String readArea, boolean onHands){
        this.setBookName(bookName);
        this.setReadArea(readArea);
        this.setOnHands(onHands);
    }
}

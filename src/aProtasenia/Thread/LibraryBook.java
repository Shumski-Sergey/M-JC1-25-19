package aProtasenia.Thread;

public class LibraryBook {
    private String book;
    private boolean hands;
    private String readArea;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public boolean isHands() {
        return hands;
    }

    public void setHands(boolean hands) {
        this.hands = hands;
    }

    public String getReadArea() {
        return readArea;
    }

    public void setReadArea(String readArea) {
        this.readArea = readArea;
    }
    public LibraryBook(String book, String readArea, boolean hands){
        this.setBook(book);
        this.setReadArea(readArea);
        this.setHands(hands);
    }
}

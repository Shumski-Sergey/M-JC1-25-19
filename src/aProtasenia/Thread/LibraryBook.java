package aProtasenia.Thread;

public class LibraryBook {
    private String book;
    private boolean hands;
    private String area;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public LibraryBook(String book, String area, boolean hands){
        this.setBook(book);
        this.setArea(area);
        this.setHands(hands);
    }
}

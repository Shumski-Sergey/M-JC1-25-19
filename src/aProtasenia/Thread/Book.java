package src.aProtasenia.Thread;

public class Book {
    private String book;
    private boolean use;
    private String area;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public Book(String book, String area, boolean use){
        this.setBook(book);
        this.setArea(area);
        this.setUse(use);
    }
}

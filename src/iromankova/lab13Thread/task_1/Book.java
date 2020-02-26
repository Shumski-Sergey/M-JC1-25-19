package iromankova.lab13Thread.task_1;

public class Book {
    private String bookTitle;
    private boolean isAvailableAtReadingRoom;
    private boolean isAvailableToBorrow;
    public BookStatus status;
    private String bookReader;

    public Book(String bookTitle, boolean isAvailableAtReadingRoom, boolean isAvailableToBorrow) {
        this.bookTitle = bookTitle;
        this.isAvailableAtReadingRoom = isAvailableAtReadingRoom;
        this.isAvailableToBorrow = isAvailableToBorrow;
        this.status = BookStatus.AVAILABLE;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isAvailableAtReadingRoom() {
        return isAvailableAtReadingRoom;
    }

    public boolean isAvailableToBorrow() {
        return isAvailableToBorrow;
    }

    public BookStatus getStatus() {
        return status;
    }

    public String getBookReader() {
        return this.bookReader;
    }

    public void setBookReader(String bookReader) {
        this.bookReader = bookReader;
    }

}

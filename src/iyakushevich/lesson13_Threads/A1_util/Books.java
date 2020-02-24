package iyakushevich.lesson13_Threads.A1_util;

public class Books{
    private boolean takeAway;
    private String bookName;
    private volatile boolean onHands = false;

    public Books(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public boolean isOnHands() {
        return onHands;
    }

    public void setOnHands(boolean onHands) {
        this.onHands = onHands;
    }
}

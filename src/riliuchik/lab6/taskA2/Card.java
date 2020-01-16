package riliuchik.lab6.taskA2;

public class Card {
    private String type; //пластиковая или виртуальная
    private String paymentSystem; //Visa, Mastercard и др.
    private String level; //Classic, Gold, Platinum и др.
    private String cardHolder;
    private String expirationDate;
    private String currency;
    private int balance;
    private boolean onlinePayment;
    private boolean internationalPayment;

    public Card(String cardHolder, int balance, String expirationDate) {
        this.cardHolder = cardHolder;
        this.balance = balance;
        this.expirationDate = expirationDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
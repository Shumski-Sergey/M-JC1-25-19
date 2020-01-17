package riliuchik.lab6.taskA2;

public class CreditCard extends Card {
    private int limit; //максимальная сумма кредита
    private String date; //срок погашения задолженности

    public CreditCard(String cardHolder, int balance, String date, String expirationDate) {
        super(cardHolder, balance, expirationDate);
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
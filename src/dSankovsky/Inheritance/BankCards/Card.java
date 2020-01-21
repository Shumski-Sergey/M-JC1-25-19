package dSankovsky.Inheritance.BankCards;

public class Card {

    private String cardNumber;
    private String date;
    private String cardHolder;
    private int CVS;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getCVS() {
        return CVS;
    }

    public void setCVS(int CVS) {
        this.CVS = CVS;
    }
}

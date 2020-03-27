package aProtasenia.lab7_OOP.BankCards;

public class BankCards {
    private String cardName, cardNumber, date, cardHolder;private int CVS;
    String getCardNumber() { return cardNumber; } void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public String getDate() { return date; } public void setDate(String date) { this.date = date; }
    public String getCardHolder() { return cardHolder; } public void setCardHolder(String cardHolder) { this.cardHolder = cardHolder; }
    int getCVS() { return CVS; } void setCVS(int CVS) { this.CVS = CVS; }
    String getCardName() { return cardName; } void setCardName(String cardName) { this.cardName = cardName; }
}

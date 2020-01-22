package dSankovsky.Inheritance.BankCards;

public class VIsaCC extends CreditCard {
    private String cardName;

    public VIsaCC(String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
        this.setCardName(cardName);
        this.setCardNumber(cardNumber);
        this.setDate(cardDate);
        this.setCardHolder(cardHolder);
        this.setCVS(cardCVS);
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}


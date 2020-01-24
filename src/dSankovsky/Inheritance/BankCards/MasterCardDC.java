package dSankovsky.Inheritance.BankCards;

public class MasterCardDC extends DebitCard {
    private String cardName;
    public MasterCardDC(String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
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

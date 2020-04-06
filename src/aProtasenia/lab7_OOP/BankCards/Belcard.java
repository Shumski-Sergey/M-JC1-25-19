package aProtasenia.lab7_OOP.BankCards;

class Belcard extends Belarus {
    public Belcard(String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
        this.setCardName(cardName); this.setCardNumber(cardNumber); this.setDate(cardDate);
        this.setCardHolder(cardHolder); this.setCVS(cardCVS);
    }
}
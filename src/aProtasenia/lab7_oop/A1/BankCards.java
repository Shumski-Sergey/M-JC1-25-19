package src.aProtasenia.lab7_oop.A1;
//Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.

class testBankCards {
    public static void main(String[] args) {
        belCard belCard = new belCard("BelCard Schodraia", "9113 3245 4566 1456", "10/22", "Andrei Pratasenia", 345);
        International masterCard = new masterCard("MasterCard Standart", "5466 5678 1265 6788", "03/23", "Andrei Pratasenia", 777);
        System.out.println(belCard.getCardName()+" "+belCard.getCardNumber()+" "+belCard.getDate()+" "+belCard.getCardHolder()+" "+belCard.getCVS());
        System.out.println(masterCard.getCardName()+" "+masterCard.getCardNumber()+" "+masterCard.getDate()+" "+masterCard.getCardHolder()+" "+masterCard.getCVS());
    }
}
public class BankCards {
    private String cardName, cardNumber, date, cardHolder;private int CVS;
    public String getCardNumber() { return cardNumber; } public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public String getDate() { return date; } public void setDate(String date) { this.date = date; }
    public String getCardHolder() { return cardHolder; } public void setCardHolder(String cardHolder) { this.cardHolder = cardHolder; }
    public int getCVS() { return CVS; } public void setCVS(int CVS) { this.CVS = CVS; }
    public String getCardName() { return cardName; } public void setCardName(String cardName) { this.cardName = cardName; }
}
abstract class International extends BankCards{}
abstract class Belarus extends BankCards{}

class belCard extends Belarus{
    public belCard (String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
        this.setCardName(cardName); this.setCardNumber(cardNumber); this.setDate(cardDate);
        this.setCardHolder(cardHolder); this.setCVS(cardCVS);
    }
}
class masterCard extends International{
    public masterCard (String cardName, String cardNumber, String cardDate, String cardHolder, int cardCVS) {
        this.setCardName(cardName); this.setCardNumber(cardNumber); this.setDate(cardDate);
        this.setCardHolder(cardHolder); this.setCVS(cardCVS);
    }
}





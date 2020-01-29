package Lab6_2a_OOP;

public class MTBankCard {
    private String nameOfBank;
    private String typeOfCard; //дебетовая, кредитная, онлайн
    private String paymentSystem;
    private String numbOfCard;
    private String cardOwner;
    private String cardExpityDate;
    private int cvv;
    private boolean contactlessPayment; //бесконтактная оплата

    public MTBankCard(String nameOfBank, String typeOfCard, String paymentSystem,String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment) {
        this.nameOfBank = nameOfBank;
        this.typeOfCard = typeOfCard;
        this.paymentSystem = paymentSystem;
        this.numbOfCard = numbOfCard;
        this.cardOwner = cardOwner;
        this.cardExpityDate = cardExpityDate;
        this.cvv = cvv;
        this.contactlessPayment = contactlessPayment;
        }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public String getNumbOfCard() {
        return numbOfCard;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public String getCardExpityDate() {
        return cardExpityDate;
    }

    public int getCvv() {
        return cvv;
    }

    public boolean isContactlessPayment() {
        return contactlessPayment;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void setNumbOfCard(String numbOfCard) {
        this.numbOfCard = numbOfCard;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public void setCardExpityDate(String cardExpityDate) {
        this.cardExpityDate = cardExpityDate;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setContactlessPayment(boolean contactlessPayment) {
        this.contactlessPayment = contactlessPayment;
    }
}

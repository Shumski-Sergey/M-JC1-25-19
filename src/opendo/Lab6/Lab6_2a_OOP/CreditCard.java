package Lab6_2a_OOP;

public class CreditCard extends MTBankCard {
    private String nameOfTariff;
    private long minAmountOfCreditLine;
    private String maxAmountOgCreditCard;
    private int interestRate;
    private int gracePeriod;

    public CreditCard(String nameOfBank, String typeOfCard, String paymentSystem, String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment, String nameOfTariff, long minAmountOfCreditLine, String maxAmountOgCreditCard, int interestRate, int gracePeriod) {
        super(nameOfBank, typeOfCard, paymentSystem, numbOfCard, cardOwner, cardExpityDate, cvv, contactlessPayment);
        this.nameOfTariff = nameOfTariff;
        this.minAmountOfCreditLine = minAmountOfCreditLine;
        this.maxAmountOgCreditCard = maxAmountOgCreditCard;
        this.interestRate = interestRate;
        this.gracePeriod = gracePeriod;
    }

    public String getNameOfTariff() {
        return nameOfTariff;
    }

    public long getMinAmountOfCreditLine() {
        return minAmountOfCreditLine;
    }

    public String getMaxAmountOgCreditCard() {
        return maxAmountOgCreditCard;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setNameOfTariff(String nameOfTariff) {
        this.nameOfTariff = nameOfTariff;
    }

    public void setMinAmountOfCreditLine(long minAmountOfCreditLine) {
        this.minAmountOfCreditLine = minAmountOfCreditLine;
    }

    public void setMaxAmountOgCreditCard(String maxAmountOgCreditCard) {
        this.maxAmountOgCreditCard = maxAmountOgCreditCard;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }
}


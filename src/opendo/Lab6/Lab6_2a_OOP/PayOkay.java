package Lab6_2a_OOP;

public class PayOkay extends DebitCard {
    private int cashback;
    private boolean specialExchangeRate; //специальный курс валют
    private boolean insurance;

    public PayOkay(String nameOfBank, String typeOfCard, String paymentSystem, String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment, String nameOfTariff, String accountCurrency, int paymentForUse, int cashback, boolean specialExchangeRate, boolean insurance) {
        super(nameOfBank, typeOfCard, paymentSystem, numbOfCard, cardOwner, cardExpityDate, cvv, contactlessPayment, nameOfTariff, accountCurrency, paymentForUse);
        this.cashback = cashback;
        this.specialExchangeRate = specialExchangeRate;
        this.insurance = insurance;
    }

    public int getCashback() {
        return cashback;
    }

    public boolean isSpecialExchangeRate() {
        return specialExchangeRate;
    }

    public boolean isInsurance() {
        return insurance;
    }
}

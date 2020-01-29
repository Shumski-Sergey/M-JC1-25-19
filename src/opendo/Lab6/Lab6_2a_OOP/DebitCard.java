package Lab6_2a_OOP;

public class DebitCard extends MTBankCard {
    private String nameOfTariff;
    private String accountCurrency;
    private int paymentForUse;

    public DebitCard(String nameOfBank, String typeOfCard, String paymentSystem,String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment, String nameOfTariff, String accountCurrency, int paymentForUse) {
        super(nameOfBank, typeOfCard, paymentSystem, numbOfCard, cardOwner, cardExpityDate, cvv, contactlessPayment);
        this.nameOfTariff = nameOfTariff;
        this.accountCurrency = accountCurrency;
        this.paymentForUse = paymentForUse;
    }

    public String getNameOfTariff() {
        return nameOfTariff;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public int getPaymentForUse() {
        return paymentForUse;
    }

    public void setNameOfTariff(String nameOfTariff) {
        this.nameOfTariff = nameOfTariff;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public void setPaymentForUse(int paymentForUse) {
        this.paymentForUse = paymentForUse;
    }
}


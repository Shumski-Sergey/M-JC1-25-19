package Lab6_2a_OOP;

public class ProshcheProstogo extends CreditCard {
    private int loanTerms; //срок кредитования
    private boolean incomeStatement; //наличие справки о доходах
    private boolean surety; //наличие поручителей

    public ProshcheProstogo(String nameOfBank, String typeOfCard, String paymentSystem, String numbOfCard, String cardOwner, String cardExpityDate, int cvv, boolean contactlessPayment, String nameOfTariff, long minAmountOfCreditLine, String maxAmountOgCreditCard, int interestRate, int gracePeriod, int loanTerms, boolean incomeStatement, boolean surety) {
        super(nameOfBank, typeOfCard, paymentSystem, numbOfCard, cardOwner, cardExpityDate, cvv, contactlessPayment, nameOfTariff, minAmountOfCreditLine, maxAmountOgCreditCard, interestRate, gracePeriod);
        this.loanTerms = loanTerms;
        this.incomeStatement = incomeStatement;
        this.surety = surety;
    }

    public int getLoanTerms() {
        return loanTerms;
    }

    public boolean isIncomeStatement() {
        return incomeStatement;
    }

    public boolean isSurety() {
        return surety;
    }
   }

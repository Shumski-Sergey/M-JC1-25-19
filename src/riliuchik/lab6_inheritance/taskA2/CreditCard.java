package riliuchik.lab6_inheritance.taskA2;

public class CreditCard extends Card {
    private long limit; //максимальная сумма кредита
    private String dateOfRepayment; //срок погашения задолженности

    public CreditCard(String contractNumber, String cardHolder, long balance, String dateOfRepayment, String expirationDate) {
        super(contractNumber, cardHolder, balance, expirationDate);
        this.dateOfRepayment = dateOfRepayment;
    }

    public String getDateOfRepayment() {
        return dateOfRepayment;
    }
}
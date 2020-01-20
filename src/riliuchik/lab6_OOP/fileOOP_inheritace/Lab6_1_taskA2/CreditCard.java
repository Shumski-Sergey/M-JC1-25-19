package src.riliuchik.lab6_OOP.fileOOP_inheritace.Lab6_1_taskA2;

public class CreditCard extends Card {
    private long limit; //максимальная сумма кредита
    private String dateOfRepayment; //срок погашения задолженности

    public CreditCard(String contractNumber, String cardHolder, long balance, String currency, String dateOfRepayment, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
        this.dateOfRepayment = dateOfRepayment;
    }

    public String getDateOfRepayment() {
        return dateOfRepayment;
    }

    @Override
    public void shortInfo() {
        System.out.print("Владелец карты по договору № " + getContractNumber() + ": "
                + getCardHolder() + " Баланс: " + getBalance() + " " + getCurrency()
                + " Установленный срок для погашения задолженности: " + getDateOfRepayment()
                + " Дата окончания договора: " + getExpirationDate());
    }
}
package iyakushevich.lesson6.A2_util;

public class BankCard {
    private String paymentSystems;
    private String number;
    private int expireMonth;
    private int expireYear;
    private int cvv2;

    public BankCard(String paymentSystems, String number, int expireMonth, int expireYear, int cvv2) {
        this.paymentSystems = paymentSystems;
        this.number = number;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.cvv2 = cvv2;
    }

    public void printCard() {
        System.out.println("New card created: ");
        System.out.println("Payment system: " + paymentSystems + '\n' + "Card number: " + number + '\n' +
                "Expire month/year: " + expireMonth + '/' + expireYear + '\n' + "CCV2: " + cvv2);
    }
}

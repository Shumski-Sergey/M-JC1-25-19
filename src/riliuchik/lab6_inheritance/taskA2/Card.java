package riliuchik.lab6_inheritance.taskA2;

public class Card {
    private String contractNumber;
    private String dateOfContract;
    private String type; //пластиковая или виртуальная
    private String paymentSystem; //Visa, Mastercard и др.
    private String level; //Classic, Gold, Platinum и др.
    private long cardNumber;
    private String expirationDate;
    private String nameOnCard;
    private String currency;
    private long balance;
    private boolean onlinePayment;
    private boolean internationalPayment;
    private String cardHolder;


    public Card(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        this.contractNumber = contractNumber;
        this.cardHolder = cardHolder;
        this.balance = balance;
        this.currency = currency;
        this.expirationDate = expirationDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public long getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void shortInfo() {
        System.out.println("Владелец карты по договору № " + getContractNumber() + ": "
                + getCardHolder() + " Баланс: " + getBalance() + " " + getCurrency()
                + " Дата окончания договора: " + getExpirationDate());
    }
}
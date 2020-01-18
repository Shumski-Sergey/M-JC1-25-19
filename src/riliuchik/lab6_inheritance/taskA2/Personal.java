package riliuchik.lab6_inheritance.taskA2;

public class Personal extends DebitCard {
    private boolean bonuses;

    public Personal(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
    }
}
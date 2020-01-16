package riliuchik.lab6.taskA2;

public class Personal extends DebitCard {
    private boolean bonuses;

    public Personal(String cardHolder, int balance, String expirationDate) {
        super(cardHolder, balance, expirationDate);
    }
}
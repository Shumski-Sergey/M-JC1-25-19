package riliuchik.lab6.taskA2;

public class DebitCard extends Card {
    private boolean additionalCards;

    public DebitCard(String cardHolder, int balance, String expirationDate) {
        super(cardHolder, balance, expirationDate);
    }
}
package riliuchik.lab6_OOP.fileOOP_inheritace.taskA2;

public class DebitCard extends Card {
    private boolean additionalCards;

    public DebitCard(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
    }
}
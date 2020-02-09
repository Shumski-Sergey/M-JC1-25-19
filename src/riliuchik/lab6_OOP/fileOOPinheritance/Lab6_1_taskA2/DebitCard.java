package riliuchik.lab6_OOP.fileOOPinheritance.Lab6_1_taskA2;

public class DebitCard extends Card {
    private boolean additionalCards;

    public DebitCard(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
    }
}
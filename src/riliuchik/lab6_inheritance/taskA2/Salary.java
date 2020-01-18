package riliuchik.lab6_inheritance.taskA2;

public class Salary extends DebitCard {
    private int numberOfEmployees;

    public Salary(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
    }
}
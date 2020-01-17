package riliuchik.lab6_inheritance.taskA2;

public class Salary extends DebitCard {
    private int numberOfEmployees;

    public Salary(String contractNumber, String cardHolder, long balance, String expirationDate) {
        super(contractNumber, cardHolder, balance, expirationDate);
    }
}
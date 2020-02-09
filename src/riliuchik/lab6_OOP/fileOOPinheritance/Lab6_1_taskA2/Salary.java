package riliuchik.lab6_OOP.fileOOPinheritance.Lab6_1_taskA2;

public class Salary extends DebitCard {
    private int numberOfEmployees;

    public Salary(String contractNumber, String cardHolder, long balance, String currency, String expirationDate) {
        super(contractNumber, cardHolder, balance, currency, expirationDate);
    }
}
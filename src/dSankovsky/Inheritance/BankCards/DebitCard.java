package dSankovsky.Inheritance.BankCards;

public class DebitCard extends Card implements AccountRefill {

    public double addMoney() {
        return Constants.DEBIT_MONEY;
    }
}

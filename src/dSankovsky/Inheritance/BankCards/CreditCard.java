package dSankovsky.Inheritance.BankCards;

public class CreditCard extends Card implements AccountRefill {

    public double addMoney() {
        return Constants.CREDIT_MONEY;
    }

}

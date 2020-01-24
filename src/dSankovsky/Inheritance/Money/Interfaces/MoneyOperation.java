package dSankovsky.Inheritance.Money.Interfaces;

import dSankovsky.Inheritance.Money.Money;

public interface MoneyOperation {
    void sumMoney(Money money1, Money money2);
    void subMoney(Money money1, Money money2);
    void divMoney(Money money1, Money money2);
    void divMoneyWithConst(Money money1, double divider);
    void mulMoneyWithConst(Money money1, double multiplier);
    void equalMoney(Money money1, Money money2);


}

package dSankovsky.Inheritance.Money;

import dSankovsky.Inheritance.Money.Interfaces.MoneyOperation;

public class Operations implements MoneyOperation {
public void sumMoney(Money money1, Money money2) {
        long rubels = 0;
        char pennys = 0;
        if ((money1.getPenny() + money2.getPenny()) >= 100) {
            pennys = (char) ((money1.getPenny() + money2.getPenny()) % 100);
            rubels = ((money1.getPenny() + money2.getPenny()) - pennys) / 100;
        } else {
            pennys = (char) (money1.getPenny() + money2.getPenny());
        }
        //TODO make another penny output
        System.out.println((money1.getRuble() + money2.getRuble() + rubels) + "." + ((int) pennys));
    }

    public void subMoney(Money money1, Money money2) {
        if (money1.getRuble() > money2.getRuble()) {
            if (money1.getPenny() > money2.getPenny()) {
                System.out.println((money1.getRuble() - money2.getRuble()) + "." + (money1.getPenny() - money2.getPenny()));
            } else {
                System.out.println((money1.getRuble() - money2.getRuble() - 1) + "." + (money1.getPenny() + 100 - money2.getPenny()));
            }
        } else if (money1.getRuble() < money2.getRuble()) {
            if (money1.getPenny() < money2.getPenny()) {
                System.out.println((money1.getRuble() - money2.getRuble()) + "." + (money2.getPenny() - money1.getPenny()));
            } else {
                System.out.println(-(money2.getRuble() - money1.getRuble() + 1) + "." + (money2.getPenny() + 100 - money1.getPenny()));
            }
        } else
            System.out.println("Result: 0");
    }

    public void divMoney(Money money1, Money money2) {
        long first = money1.getRuble() * 100 + money1.getPenny();
        long second = money2.getRuble() * 100 + money2.getPenny();
        double division = (double) first / second;
        System.out.println(division);

    }

    public void divMoneyWithConst(Money money1, double divider) {
        long first = money1.getRuble() * 100 + (money1.getPenny());
        double division = (double) (first / divider) / 100;
        System.out.println(division);
    }

    public void mulMoneyWithConst(Money money1, double multiplier) {
        long first = money1.getRuble() * 100 + money1.getPenny();
        double multiplication = (double) (first * multiplier) / 100;
        System.out.println(multiplication);
    }

    public void equalMoney(Money money1, Money money2) {
        if (money1.getRuble() > money2.getRuble()) {
            System.out.println(money1.getRuble() + "." + (int) money1.getPenny() + " > " + money2.getRuble() + "." + (int) money2.getPenny());
        } else if (money1.getRuble() < money2.getRuble()) {
            System.out.println(money1.getRuble() + "." + (int) money1.getPenny() + " < " + money2.getRuble() + "." + (int) money2.getPenny());
        } else if (money1.getPenny() > money2.getPenny()) {
            System.out.println(money1.getRuble() + "." + (int) money1.getPenny() + " > " + money2.getRuble() + "." + (int) money2.getPenny());
        } else if (money1.getPenny() < money2.getPenny()) {
            System.out.println(money1.getRuble() + "." + (int) money1.getPenny() + " < " + money2.getRuble() + "." + (int) money2.getPenny());
        } else {
            System.out.println(money1.getRuble() + "." + (int) money1.getPenny() + " = " + money2.getRuble() + "." + (int) money2.getPenny());
        }
    }
}



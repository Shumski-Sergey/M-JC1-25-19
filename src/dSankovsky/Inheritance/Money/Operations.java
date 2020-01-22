package dSankovsky.Inheritance.Money;

import dSankovsky.Inheritance.Money.Interfaces.MoneyOperation;

public class Operations implements MoneyOperation {
//money1.getRuble()+money2.getRuble()+","+

    @Override
    public void sumMoney(Money money1, Money money2) {
        long rubels = 0;
        char pennys = 0;
        if ((money1.getPenny() + money2.getPenny()) >= 100) {
            pennys = (char) ((money1.getPenny() + money2.getPenny()) % 100);
            rubels = ((money1.getPenny() + money2.getPenny()) - pennys) / 100;
        }else{
            pennys = (char)(money1.getPenny() + money2.getPenny());
        }
        //TODO make another penny output
        System.out.println((money1.getRuble() + money2.getRuble() + rubels) + "," + ((int) pennys));
    }

    @Override
    public void subMoney(Money money1, Money money2) {
        if (money1.getRuble() > money2.getRuble()) {
            if(money1.getPenny() > money2.getPenny()){
                System.out.println((money1.getRuble()-money2.getRuble())+","+(money1.getPenny()-money2.getPenny()));
            }else{
                System.out.println((money1.getRuble()-money2.getRuble()-1)+","+(money1.getPenny()+100-money2.getPenny()));
            }
        }else if(money1.getRuble() < money2.getRuble()){
            if(money1.getPenny() < money2.getPenny()){
                System.out.println((money1.getRuble()-money2.getRuble())+","+(money2.getPenny()-money1.getPenny()));
            }else{
                System.out.println(-(money2.getRuble()-money1.getRuble()+1)+","+(money2.getPenny()+100-money1.getPenny()));
            }
        }else
            System.out.println("Result: 0");

    }

    @Override
    public void divMoney(Money money1, Money money2) {

    }

    @Override
    public void divMoneyWithConst(Money money1, double divider) {

    }

    @Override
    public void mulMoneyWithConst(Money money1, double multiplier) {

    }

    @Override
    public void equalMoney(Money money1, Money money2) {

    }
}



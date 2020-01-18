package tmurashka.lab6.B1;

public class Operator {
    public Money sum(Money a, Money b) {
        return getMoneyFromFull(getFullMoney(a) + getFullMoney(b));
    }

    public Money divide(Money a, Money b) {
        return getMoneyFromFull(getFullMoney(a) / getFullMoney(b));
    }

    public Money minus(Money a, Money b) {
        return getMoneyFromFull(Math.abs(getFullMoney(a) - getFullMoney(b)));
    }

    public boolean equals (Money a, Money b) {
        return getFullMoney(a) == getFullMoney(b);
    }

    public Money division(Money a, float b) {
        return getMoneyFromFull(getFullMoney(a) / b);
    }

    public Money multiply(Money a, float b) {
        return getMoneyFromFull(getFullMoney(a) * b);
    }

    private float getFullMoney(Money money) {
        return money.getRubles() + money.getCents() / 100f;
    }

    private Money getMoneyFromFull(float full) {
        return new Money((int)full, (byte)((full - (int)full) * 100));
    }

}

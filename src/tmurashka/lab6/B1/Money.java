package tmurashka.lab6.B1;

public class Money {
    public Money (int rubles, byte cents) {
        this.rubles = rubles;
        this.cents = cents;
    }

    @Override
    public String toString() {
        return String.format(rubles + "," + cents);
    }

    public int getRubles() {
        return rubles;
    }

    public byte getCents() {
        return cents;
    }

    private int rubles;
    private byte cents;
}

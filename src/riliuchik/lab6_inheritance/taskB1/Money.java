package riliuchik.lab6_inheritance.taskB1;

public class Money {
    private long rubles;
    private char[] kopeks;

    public Money(long rubles, char[] kopeks) {
        this.rubles = rubles;
        this.kopeks = kopeks;
    }


    public long getRubles() {
        return rubles;
    }

    public char[] getKopeks() {
        return kopeks;
    }

    @Override
    public String toString() {
        return rubles + "," + new String(kopeks);
    }
}
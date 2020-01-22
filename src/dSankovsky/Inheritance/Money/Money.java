package dSankovsky.Inheritance.Money;

public class Money {

    private long ruble;
    private char penny;

    public Money(long ruble, char penny){
        this.setRuble(ruble);
        this.setPenny(penny);
    }

    public long getRuble() {
        return ruble;
    }

    public void setRuble(long ruble) {
        this.ruble = ruble;
    }

    public char getPenny() {
        return penny;
    }

    public void setPenny(char penny) {
        this.penny = penny;
    }
}

package src.yuhnovskaya.Lab6_OOP.A2;

public class Card {
    private String bank;
    private String owner;
    public double byrTOusd;
    public double usdTOrub;
    public Card() {
    }
    public Card(String bank, String owner, double byrTOusd, double usdTOrub) {
        this.bank = bank;
        this.owner=owner;
        this.byrTOusd=byrTOusd;
        this.usdTOrub=usdTOrub;
    }
    public String getBank() {return bank;}
    public void setBank() {this.bank=bank;}

    public String getOwner(){return owner;}
    public void setOwner(){this.owner=owner;}
}

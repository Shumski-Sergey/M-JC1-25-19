package yuhnovskaya.Lab6.A2;

public class DebitCard extends Card{
    private int cashback;

    public DebitCard(String bank, String owner, double byrTOusd, double usdTOrub, int cashback) {
        super(bank, owner, byrTOusd, usdTOrub);
        this.cashback = cashback;
    }
    public  int getCashback() {
        return cashback;
    }
    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}

package src.yuhnovskaya.Lab6.A2;

public class VisaDebitCard extends DebitCard{
    public VisaDebitCard(String bank, String owner, double byrTOusd, double usdTOrub, int cashback){
        super(bank,owner,byrTOusd,usdTOrub,cashback);
    }
    public double conv_byrTOrub() {
        double rub=byrTOusd*usdTOrub;
        return rub;}
}

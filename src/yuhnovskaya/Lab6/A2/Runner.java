package src.yuhnovskaya.Lab6.A2;

public class Runner {
    public static void main(String[] avgs){
        VisaDebitCard firstCard= new VisaDebitCard("bps","A", 0.47, 61.5, 3);
        System.out.print("Exchange rate BYR to RUB: "+ firstCard.conv_byrTOrub());}
}

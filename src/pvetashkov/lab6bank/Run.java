package pvetashkov.lab6bank;
import pvetashkov.lab6bank.service.impl.BankomatServiceImpl;// не получалось по условию, сделал, как смог.
import java.util.Scanner;
public class Run {
    public static void main(String[]args){
        int a,b,c, A,B,C, sum;
        BankomatServiceImpl bankomat=new BankomatServiceImpl();
        Bankomat bank=new Bankomat(50, 45, 35);
        System.out.println("Enter sum, cash $20-50-100");
        Scanner sc=new Scanner(System.in);
        sum=sc.nextInt();
        a= sum/100;
        b=(sum-a*100)/50;
        c=(sum-(a*100)-(b*50))/20;
        A = bank.getHundred() - a;
        B = bank.getFifty() - b;
        C = bank.getTwenty() - c;
        if (A<0||B<0||C<0){
            System.out.print("Have no money");
           }
        else {
            System.out.println("$100 *"+a+", "+"$50* "+b+", "+"$20* "+c);
            System.out.println("so i have $20*"+A+" pieces, $50*"+B+" pcs and $100*"+C+" pcs. It's greate, ROB ME!");
            }
        }
    private static Object cash() {
        return cash();
    }
}

package pvetashkov;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args){
    int a,b,c,d;
    int sum;
    System.out.println("enter any");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=a/100;
    c=(a%100)/10;
    d=a%10;
    sum=b+c+d;
    System.out.println("the summ is"+sum);
    }
}

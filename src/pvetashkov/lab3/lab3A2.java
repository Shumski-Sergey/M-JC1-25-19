package pvetashkov.lab3;
import java.util.Scanner;
public class lab3A2 {
    public static void main(String []args){
        int a,i;
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for ( i=2;i<(a-1);i++);
         if (a%i != 0) {
             System.out.println("no, it's not simple");
         }else {
                System.out.println("it is simple");
             }
        }
    }
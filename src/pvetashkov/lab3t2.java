package pvetashkov;
import java.util.Scanner;
public class lab3t2 {
    public static void main(String []args){
        int a,i;
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for ( i=2;i<a;i++);
         if (a%i !=0) {
             System.out.println("no, it's not simple");
         }else {
                System.out.println("it is simple");
             }
        }
    }
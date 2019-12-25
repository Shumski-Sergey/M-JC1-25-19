package pvetashkov;
import java.util.Scanner;
public class lab3t3factorial {
    public static void main(String[] args){
        int n;
        System.out.println("enter num to count factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        long fact=1;
        for (int i=1; i<=n;i++){
            fact=(fact*i);
        }
        System.out.println("factorial equal  "+fact);
    }
}

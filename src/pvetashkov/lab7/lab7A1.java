package src.pvetashkov.lab7;
import java.util.ArrayList;
import java.util.Scanner;
public class lab7A1{
    public static void main(String[]args) {
        int n;
        ArrayList<Object> laba = new ArrayList<>();
        laba.add(0, 1234);
        laba.add(1, "Joe");
        laba.add(2, 12.2345);
        laba.add(3, false);
        System.out.println("print sheet No ...");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Sheet number "+n+ " is "+ laba.get(n-1));
    }
}
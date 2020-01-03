package yuhnovskaya.Lab3;

import java.util.Scanner;

public class Les3_B1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int f=1;
        for (int i=1; i<=n; i++)
        {f=f*i;}
        System.out.println(n+"!="+f);
    }
}

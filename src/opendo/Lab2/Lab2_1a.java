package opendo;

import java.util.Scanner;
public class Lab2_1a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input M: ");
        double m = in.nextDouble();
        System.out.print("Input N: ");
        double n = in.nextDouble();
        System.out.printf("M: %f  N: %f \n", m, n);
        in.close();

        double x=10;
        double d1=x-m;
        double d2=x-n;
        double diff1=Math.abs(d1);
        double diff2=Math.abs(d2);

        if (diff1<diff2) {
            System.out.println("Ближайшее число к 10 - " + m);
        } else {
            System.out.println("Ближайшее число к 10 - " + n);
        }
    }
}

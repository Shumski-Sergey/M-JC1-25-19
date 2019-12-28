package KKropa.Lab_1;

import java.util.Scanner;

public class Lesson_3_A2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Задайте значение переменной А:");
        int numA = in.nextInt();
        System.out.print("Задайте значение переменной В:");
        int numB = in.nextInt();
        System.out.print("Задайте значение переменной С:");
        int numC = in.nextInt();

        double x1;
        double x2;
        double x;


        int numD = numB * numB - 4 * numA * numC;
        if (numD > 0) {
            x1 = (-numB + Math.sqrt(numD)) / 2 * numA;
            x2 = (-numB - Math.sqrt(numD)) / 2 * numA;
            System.out.println("В уравнении 2 корня: \n" + "x1=" + x1 + "\n" + "x2=" + x2 + "\n" );

        } else if (numD == 0) {
            x = (-numB) / 2 * numA;
            System.out.println("В уравнении 1 корень: \n"+ "x="+ x);
        } else {
            System.out.println("В уравнении нет корней");
        }


    }
}

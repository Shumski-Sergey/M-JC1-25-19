package iyakushevich;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lesson3_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double x1, x2;
        double d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (((-b) + sqrt(d)) / (2 * a));
            x2 = (((-b) - sqrt(d)) / (2 * a));
            System.out.println("Корни " + x1 + "; " + x2);
        } else if (d == 0) {
            x1 = ((-b) / (2 * a));
            System.out.println("Корень " + x1);
        } else System.out.println("Корней нет");
    }
}

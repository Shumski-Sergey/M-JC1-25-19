package tmurashka.lab3;

import java.util.Scanner;

public class lab3_A2 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Введите числа a, b, c и нажмите Enter: ");
        Scanner scanner = new Scanner (System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        double x1, x2, x;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + " x2 = " + x2);
        }
        else if (d == 0) {
            x = -b / (2 * a);
            System.out.println("Корень уравнения = " + x);
        }
        else {
            System.out.println("Корней нет");
        }
    }
}

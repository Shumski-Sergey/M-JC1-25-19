package d.grigirchik.lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число, введите число");
            scanner.next();
        }
        x = scanner.nextInt();
        System.out.println("Вы ввели число:" + x);
        if (x % 2 == 1) {
            System.out.println("Число " + x + " является нечетным");
        } else {
            System.out.println("Число "+ x + " является четным");
        }
    }
}
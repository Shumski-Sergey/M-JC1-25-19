package aantonovich.Lesson3;

import java.util.Scanner;

public class Lesson3task4 {
    public static void main(String[] args) {
        long n;
        do {
            System.out.println("Введите натуральное число");
            n = new Scanner(System.in).nextLong();
        } while (n <= 0);

        int b = 1;
        for (int i = 2; i <= n; i++) {
            b *= i;
        }
        System.out.println("Факториал числа " + n + " = " + b);
    }
        }

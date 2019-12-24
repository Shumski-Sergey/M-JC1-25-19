package tmurashka.lab4;

import java.util.Scanner;

public class lab4_B2 {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число и нажмите Enter: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Делители числа " + n + ": ");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
}

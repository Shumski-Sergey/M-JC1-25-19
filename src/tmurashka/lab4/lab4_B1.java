package tmurashka.lab4;

import java.util.Scanner;

public class lab4_B1 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число и нажмите Enter: ");
        Scanner scanner = new Scanner(System.in);
        int f = 1;
        int i = 1;
        int n = scanner.nextInt();
        while (i <= n) {
            f *= i++;
        }
        System.out.println(n + "! = " + f);
    }
}

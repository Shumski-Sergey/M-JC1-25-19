package aantonovich.Lesson3;

import java.util.Scanner;

public class Lesson3task5 {

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Введите натуральное число");
            n = new Scanner(System.in).nextInt();
        } while (n <= 0);

        System.out.println("Делители числа " + n + " :");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            System.out.println(i + " ");
        }
    }
}

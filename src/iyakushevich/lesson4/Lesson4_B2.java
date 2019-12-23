package iyakushevich.lesson4;

/*
2. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */

import java.util.Scanner;

public class Lesson4_B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; //число для ввода

        do {
            System.out.print("Введите натуральное число: ");
            n = scanner.nextInt();
        } while (n <= 0); //натуральное число больше нуля

        System.out.print("Делители числа " + n + ": ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) System.out.print(i + ", ");
        }

        System.out.println(n); //чтобы в конце не выводилась запятая

    }
}

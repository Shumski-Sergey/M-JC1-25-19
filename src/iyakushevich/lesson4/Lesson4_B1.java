package iyakushevich.lesson4;

/*
1. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */

import java.util.Scanner;

public class Lesson4_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; //введенное число

        do {
            System.out.print("Введите положительное число число: ");
            n = scanner.nextInt();
        } while (n < 0); //число должно быть положительным

        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }

        System.out.println("Факториал числа " + n + " равен " + fact);
    }
}

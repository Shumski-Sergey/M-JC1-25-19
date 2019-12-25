package iyakushevich.lesson3;

import java.util.Scanner;

public class Lesson3_B3 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");

        //enter number
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //finding sum of all numbers from 1 to n
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        //printing result
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
    }
}

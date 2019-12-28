package riliuchik.lab3;

import java.util.Scanner;

//Имеется целое число. Следует посчитать сумму цифр данного числа.

public class Lab3_taskA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        int mod = Math.abs(num);
        int sum = 0;
        if (num != 0) {
            while (mod != 0) {
                sum += mod % 10;
                mod /= 10;
            }
            System.out.println("Сумма цифр числа " + num + " равняется " + sum);
        } else System.out.println("Вы ввели ноль");
    }
}
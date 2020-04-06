package riliuchik.lab3_loops;

import java.util.Scanner;

/**
 * Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */

public class Lab3_taskB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое натуральное число (1 и больше): ");
        int num = in.nextInt();
        String output = "";
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                int divider = num % i;
                if (divider == 0) output += i + " ";
            }
            System.out.println("Все положительные делители натурального числа " + num + ": " + output);
        } else System.out.print("Вы ввели не натуральное число");
    }
}
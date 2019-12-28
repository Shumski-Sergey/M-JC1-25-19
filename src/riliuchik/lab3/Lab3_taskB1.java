package riliuchik.lab3;

import java.util.Scanner;

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

public class Lab3_taskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое натуральное число (1 и больше): ");
        int num = in.nextInt();
        if (num > 0) {
            long pr = 1;
            for (int i = 1; i <= num; i++) {
                pr *= i;
            }
            System.out.println("Факториал числа " + num + " равняется " + pr);
        } else System.out.print("Вы ввели не натуральное число");
    }
}
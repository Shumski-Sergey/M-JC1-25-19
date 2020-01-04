package aProtasenia.lab4;

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class Lab4_b1 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число от 1 до 20");
        Scanner summator = new Scanner(System.in);
        int x = summator.nextInt();
        long sum = 1;

        for (int z = 1; z <= x; z++) {
            sum = sum * z;
        }
        System.out.print("Факториал данного числа равен: ");
        System.out.printf("%,d", sum);
    }
    }



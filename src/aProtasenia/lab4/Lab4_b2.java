package aProtasenia.lab4;

//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class Lab4_b2 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число, чтобы узнать его делители: ");
        Scanner summator = new Scanner(System.in);
        int number = summator.nextInt();

        for (int y = 1; y < number; y++) {
            if (number % y == 0) {
                System.out.print(y + " ");
            }
        }
    }
}

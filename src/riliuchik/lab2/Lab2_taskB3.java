package riliuchik.lab2;

import java.util.Scanner;

public class Lab2_taskB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + " равняется " + sum);
    }
}
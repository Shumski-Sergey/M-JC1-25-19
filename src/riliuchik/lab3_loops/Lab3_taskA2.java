package riliuchik.lab3_loops;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.

public class Lab3_taskA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        int sqrt = (int) Math.sqrt(num);
        if (num > 1) {
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    System.out.println("Число " + num + " не является простым");
                    return;
                }
            }
            System.out.println("Число " + num + " является простым");
        } else System.out.println("Число " + num + " не является простым");
    }
}
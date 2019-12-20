package iyakushevich;

import java.util.Scanner;

public class Lesson3_B2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        //enter number
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //printing numbers from N to 1
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}

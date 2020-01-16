package tabukara.lab2;

import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int x = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + x + " equal to " + sum);
    }
}

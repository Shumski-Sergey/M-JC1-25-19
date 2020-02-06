package tabukara.lab3;

import java.util.Scanner;

/**
 * Created by user on 28.12.2019.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Add Number: ");
        int n = in.nextInt();
        int sqrt = (int) Math.sqrt(n);
        if (n > 1) {
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    System.out.println("The Number " + n + " is not Simple");
                    return;
                }
            }
            System.out.println("The Number " + n + " is Simple");
        } else System.out.println("The Number " + n + " is not Simple");
    }
}
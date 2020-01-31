package src.tabukara.lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = in.nextInt();
        String r = "";
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int div = n % i;
                if (div == 0)
                    r = r + i + " ";
            }
            System.out.print("All positive divisors of a natural number" + n + "= " + r);
        } else System.out.print("You didn't enter a natural number!");
    }
}
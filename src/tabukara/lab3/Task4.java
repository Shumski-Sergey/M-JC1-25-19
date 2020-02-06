package tabukara.lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int n = in.nextInt();
        if (n > 0) {
            long pr = 1;
            for (int i = 1; i <= n; i++) {
                pr *= i;
            }
            System.out.print("Factorial of  the Number " + n + " Equal " + pr);
        } else System.out.print("You didn't enter a natural number");
    }
}
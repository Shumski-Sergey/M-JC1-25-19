import java.util.Scanner;

public class Lab3_1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int numb = in.nextInt();
        in.close();

        int factorial = 1;
        for (int i = 1; i <= numb; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + numb + " is " + factorial);
    }
}

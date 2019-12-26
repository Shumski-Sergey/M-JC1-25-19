import java.util.Scanner;

public class Lab2_3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int a = in.nextInt();

        in.close();
        int n;
        int sum = 0;
        for (n = 1; n <= a; n++) {
            sum += n;
        }
        System.out.println("Sum of numbers from 1 to " + a + " is " + sum);
    }
}




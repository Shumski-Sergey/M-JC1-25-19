import java.util.Scanner;

public class Lab3_1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int numb = in.nextInt();
        in.close();

        int sum = 0;
        int remainder;
        while (numb > 0) {
            remainder = numb % 10;
            sum +=  remainder;
            numb /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

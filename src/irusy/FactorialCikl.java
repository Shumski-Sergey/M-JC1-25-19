package src.irusy;
import java.util.Scanner;

public class FactorialCikl {
    public static int factorial(int n)
    {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int num = in.nextInt();
        System.out.println("Факториал будет: " + FactorialCikl.factorial(num));
    }

}

package opendo;
import java.util.Scanner;

public class Lab2_2a {
    public static void main(String[] args) {
        System.out.println("Solve the quadratic equation: AX²+BX+C=0");

        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        double a = in.nextDouble();
        System.out.print("Input B: ");
        double b = in.nextDouble();
        System.out.print("Input C: ");
        double c = in.nextDouble();

        System.out.printf("A: %.2f  B: %.2f  C: %.2f \n", a, b, c);
        in.close();

        double x1, x2;
        double d=b*b-4*a*c;
        if (d>0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("X1= %.2f ; X2= %.2f \n",  x1, x2);
        }else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.printf("X1= %.2f \n",  x1);
        } else {
                System.out.println("The equation has no roots.");
                }
        }
}

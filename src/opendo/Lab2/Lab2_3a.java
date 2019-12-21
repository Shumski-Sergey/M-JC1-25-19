package opendo;
import java.util.Scanner;

public class Lab2_3a {
    public static void main(String[] args) {
        System.out.println("Enter three integers pairwise unequal numbers:");

        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = in.nextInt();
        System.out.print("Input B: ");
        int b = in.nextInt();
        System.out.print("Input C: ");
        int c = in.nextInt();

        in.close();

        if (a<b && b<c) {
             System.out.println("A= " + a +"; B= " + b + "; C= " + c);
            } else if (a<c && c<b) {
                System.out.println("A= " + a +"; C= " + c + "; B= " + b);
            } else if (b<c && c<a) {
              System.out.println("B= " + b +"; C= " + c + "; A= " + a);
            } else if (b<a && a<c) {
              System.out.println("B= " + b +"; A= " + a + "; C= " + c);
            } else if (c<a && a< b) {
              System.out.println("C= " + c +"; A= " + a + "; B= " + b);
            } else {
            System.out.println("C= " + c + "; B= " + b + "; A= " + a);
            }

        }
    }


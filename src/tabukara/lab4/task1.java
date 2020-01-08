package tabukara.lab4;

//import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.util.Scanner;

/**
 * Created by user on 28.12.2019.
 */
public class task1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Add Number: ");
        int n = in.nextInt();
        int m = Math.abs(n);
        int sum = 0;
        if (n != 0){
            while (m != 0 ) {
                sum += m % 10;
                m /= 10;
            }
            System.out.println("the Sum of numbers " + n + " = " + sum);
            }else System.out.println("You entered zero");
        }
    }


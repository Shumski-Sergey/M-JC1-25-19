package question1;

import java.util.Scanner;


public class Q1 {
    public void digits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Line: ");
        String ln = sc.nextLine();
        int sum = 0;
        int num = 0;

        for (int i = 0; i< ln.length(); i++){
            if (Character.isDigit(ln.charAt(i))){
                num += 1;
                sum += Character.getNumericValue(ln.charAt(i));
            }
        }
        System.out.println("The number of digits in the line is =" +num);
        System.out.println("Sum of digits in the line is =" +sum);
    }
}
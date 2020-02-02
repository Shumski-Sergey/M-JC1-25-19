package src.irusy.FirstControl.Task1;

import java.util.Scanner;

public class NumberAndSummOFDigits {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int strLen = s.length(), count = 0, sum = 0;

        for(int i = 0; i < strLen; i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                count++;
                sum +=  Character.getNumericValue(c);
            }
        }
        System.out.printf("Number of digits: %d\n", count);
        System.out.printf("Sum of digits: %d\n", sum);
    }
}

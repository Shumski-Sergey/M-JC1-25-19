package a.mitsura.FirstControl;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstTask {
    public static void main(String [] args) {
//        asking for user to enter the line
        String s = getScanner();
//        using regex to find amount of the numbers
        int num = s.length() - s.replaceAll("\\d+", "").length();
        System.out.println("in your line are"+num+" numbers");
        int sum=0;
//        using regex to delete letters from string
        String replaceLetters = s.replaceAll("\\D+", "");
//        thru the cycle searching for the numbers and then summing it
        for (int i = 0; i < replaceLetters.length(); i++) {
            if (Character.isDigit(replaceLetters.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(replaceLetters.charAt(i)));
        }
    }
        System.out.println("btw, the sum of your numbers is "+ sum);
}

    public static String getScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line");
        return sc.nextLine();
    }
}

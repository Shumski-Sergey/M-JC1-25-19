package src.skarpen.first_control.task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionMethod {
    public void AmountAndNumberOfDigits() {
        System.out.println("See the line with numbers to solve problem 1:");

        // We call the 'Sсanner' method for line input
        Scanner scanner = new Scanner(System.in); //
        String string = scanner.nextLine();

        //we define the number of digits in the line
        Variables.numberOfDigits  = string.length() - string.replaceAll("\\d+", "").length();
        System.out.print("The number of digits in the entered string: " + Variables.numberOfDigits);

        //Using a regular expression, we select numbers from the string
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(string);

        //Find the numbers and use the 'parseInt' method to redefine the string into numbers
        while (matcher.find()) {
            Variables.sumOfDigits += Integer.parseInt(matcher.group());
        }
        System.out.print("\n" + "Sum of numbers: "+ Variables.sumOfDigits);

        scanner.close();

        System.out.println("The end");
    }
}

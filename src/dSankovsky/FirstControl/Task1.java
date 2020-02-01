package dSankovsky.FirstControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * enter the line, find only numbers and their amount, calculate sum of numbers
 *
 * @author Dmitry Sankovsky
 */

public class Task1 {
    public static void main(String[] args) throws IOException {

        UtilClass utilClass = new UtilClass();
        String line = utilClass.EnterTheLine();

        List<Character> numbersList = new ArrayList<>();
        FindNumbers(line, numbersList);
        SumCalculation(numbersList);
    }

    //this method find only numbers in the line
    public static void FindNumbers(String line, List<Character> numbersList) {
        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                numbersList.add(c);
            }
        }
        System.out.println("Amount of numbers: " + (numbersList.size()));
    }

    // this method calculate sum of numbers
    public static void SumCalculation(List<Character> numbersList) {
        int sum = 0;
        for (char c : numbersList) {
            sum += Character.getNumericValue(c);
        }
        System.out.println("Sum of numbers: " + sum);
    }
}

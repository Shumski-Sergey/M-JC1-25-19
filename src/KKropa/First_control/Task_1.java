package KKropa.First_control;
//1. В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)
import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args){

        int amountOfNumbers = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in); //Enter some line from the keyboard
        System.out.print("Enter line: ");
        String StrOfSymbols = scanner.nextLine();

        for (int i=0; i<StrOfSymbols.length(); i++ ){ //Check each item in a row
            if (Character.isDigit(StrOfSymbols.charAt(i))){ //If the element is digit, than do next:
                amountOfNumbers++; //Count the numbers of digit
                sum+=Character.getNumericValue(StrOfSymbols.charAt(i)); //Summarize numbers of line
            }
        }
        System.out.println("Amount of digit: " + amountOfNumbers + ". Sum of numbers: " + sum + ".");
    }
}

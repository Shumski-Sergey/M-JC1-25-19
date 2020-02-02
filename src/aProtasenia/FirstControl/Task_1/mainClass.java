package src.aProtasenia.FirstControl.Task_1;
//В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)

import java.util.Scanner;

import static src.aProtasenia.FirstControl.Task_1.numberOfDigitsPerString.numOfDigits;
import static src.aProtasenia.FirstControl.Task_1.sumOfDigitsPerString.sumOfDigits;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("Enter the string with numbers: ");
        Scanner sum = new Scanner(System.in);
        String str = sum.nextLine();

        numOfDigits(str);
        sumOfDigits(str);
    }
}

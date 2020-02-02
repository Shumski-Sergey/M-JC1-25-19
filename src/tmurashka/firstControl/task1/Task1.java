package tmurashka.firstControl.task1;

import tmurashka.firstControl.StringInputReader;
import java.io.IOException;

/**
 * В данной строке найти количество цифр. Вывести количество и сумму цифр
 */

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter string:");
        String str = StringInputReader.readStrings(1).get(0);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >='0' && currentChar <= '9') {
                count++;
                sum += (currentChar - '0');
            }
        }
        System.out.println("Number of digits per string: " + count);
        System.out.println("Sum of digits per string: " + sum);
    }
}

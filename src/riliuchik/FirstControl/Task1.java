package riliuchik.FirstControl;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * В данной строке найти количество цифр. Вывести количество и сумму цифр.
 */

public class Task1 {
    private BufferedReader reader;

    public Task1(BufferedReader reader) {
        this.reader = reader;
    }

    public void QuantityAndSum() throws IOException {
        System.out.print("Введите строку: ");
        String string = reader.readLine();
        int quantity = 0;
        int sum = 0;
        char[] characters = string.toCharArray();
        for (char character : characters) {
            if (character >= '\u0030' & character <= '\u0039') {
                quantity++;
                sum += character - '\u0030'; //преобразуем символ в цифру для нахождения суммы цифр
            }
        }
        System.out.println("Количество цифр в строке: " + quantity);
        System.out.print("Сумма цифр в строке: " + sum);
    }
}
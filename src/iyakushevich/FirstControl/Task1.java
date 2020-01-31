package iyakushevich.FirstControl;

import java.util.List;
import java.util.Scanner;

import static iyakushevich.FirstControl.Task1_util.Task1Util.*;

/**
 * 1. В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, содержащую цифры: ");
        String line = scanner.nextLine();

        List<Integer> digits = convertToNumList(line);
        System.out.println("Строка содержит следующие числа: " + digits);
        System.out.println("Количество цифр в строке: " + digits.size() + ", сумма цифр: " + intListSum(digits));
    }
}

package src.skarpen.StreamAPI;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        /**
         * Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
         * Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a random string with numbers:");
        String string;
        string = scanner.nextLine();
        String stringPrint = string.replaceAll("\\D+", " ");
        System.out.println(stringPrint);
    }
}

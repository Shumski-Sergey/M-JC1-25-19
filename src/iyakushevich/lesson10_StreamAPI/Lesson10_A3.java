package iyakushevich.lesson10_StreamAPI;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 3. Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
 * Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1
 */

public class Lesson10_A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        //String s1 = "12 text var2 14 8v 1";
        String s2 = Stream.of(s1.split(" "))
                .filter(s -> s.matches("\\b\\d+\\b"))
                .collect(Collectors.joining(" "));
        System.out.println(s2);
    }
}

package iyakushevich.lesson10_StreamAPI;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2. Считать с консоли данные(массив слов).
 * Записать в другую переменную String строку(через запятую слова), длина которых строго больше 6.
 * В конце запятой не должно быть.
 */

public class Lesson10_A2 {
    public static void main(String[] args) {
        System.out.println("Введите набор слов, разделяя их пробелом: ");

        Scanner scanner = new Scanner(System.in);
        String formatted = Stream.of(scanner.nextLine().split(" "))
                .filter(s -> s.length() > 5)
                .collect(Collectors.joining(", "));

        System.out.println(formatted);
    }
}

package riliuchik.lab8_streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
 * Числа выводить через пробел. Пример - 12 text var2 14 8v 1. Результат: 12 14 1
 */

public class Lab8_taskA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку (например, \"12 text var2 14 8v 1\"): ");
        String originalString = in.readLine();
        String rewrittenString = Stream.of(originalString.split(" +"))
                .filter(x -> x.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.print("Все числа из введённой строки: " + rewrittenString);
    }
}
package tmurashka.lab8_streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
 * Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1
 */

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = Stream.of(first.split(" ")).filter(x -> x.matches("\\d+")).collect(Collectors.joining(" "));
        System.out.println(second);
    }
}
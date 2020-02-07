package KKropa.Lab_10_Stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static KKropa.Lab_10_Stream.Util.getString;

//Считать с консоли данные.
// Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1
public class A3 {
    public static void main(String[] args) throws IOException {
        String s = getString();

        List<String> line = Arrays.asList(s.split(" "));

        String finish = line.stream()
                .filter(number -> number.matches( "\\d+"))
                .collect(Collectors.joining(" "));

        System.out.println(finish);





    }
}

package src.aProtasenia.Stream_API;

//Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_A3 {
    public static void main(String[] args) {
        String example = "12 text var2 14 8v 1";
        System.out.println(example);
        String result = Stream.of(example.split(" ")).filter(x -> x.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

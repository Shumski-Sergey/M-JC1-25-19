package aantonovich.StreamAPI;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Считать с консоли данные. Вывести во вторую переменную все числа,
// которые есть в первом файле. Числа выводить через пробел.
// Пример - 12 text var2 14 8v 1 Результат: 12 14 1
public class Task3 {
    public static void main (String[] args) {

        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = Stream.of(s.split(" "))
                .filter(x -> x.matches("^\\d+$"))
                .collect(Collectors.joining(" "));
        System.out.println(s2);
    }
}
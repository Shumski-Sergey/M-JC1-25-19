package aantonovich.Stream;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Считать с консоли данные(массив слов). Записать в другую переменную String строку
// (через запятую слова), длина которых строго больше 6. В конце запятой не должно быть
public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
             String s2 = Stream.of(s.split(" "))
                .filter(x -> x.length() > 6)
                .collect(Collectors.joining(", "));
        System.out.println(s2);
    }
}
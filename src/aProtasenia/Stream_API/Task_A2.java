package src.aProtasenia.Stream_API;

//Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
// длина которых строго больше 6. В конце запятой не должно быть.

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_A2 {
    public static void main(String[] args) {
        System.out.println("Enter words:");
        Scanner keyboard = new Scanner(System.in);
        String firstString = keyboard.nextLine();
        String secondString = Stream.of(firstString.split(" ")).filter(x -> x.length() > 6)
                .collect(Collectors.joining(", "));
        System.out.println(secondString);
    }
}

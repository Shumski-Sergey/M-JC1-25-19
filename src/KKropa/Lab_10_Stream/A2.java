package KKropa.Lab_10_Stream;

// с консоли данные(массив слов).
// Записать в другую переменную String строку(через запятую слова), длина которых строго больше 6.
// В конце запятой не должно быть.

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static KKropa.Lab_10_Stream.Util.getString;


public class A2 {
    public static void main(String[] args) throws IOException {
        String s = getString();

        List<String> line = Arrays.asList(s.split(" "));

        String finish = line.stream()
                .filter(word -> word.length() > 6)
                .collect(Collectors.joining(", "));

        System.out.println(finish);


    }


}









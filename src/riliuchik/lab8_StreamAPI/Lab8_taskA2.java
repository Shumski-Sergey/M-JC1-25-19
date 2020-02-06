package riliuchik.lab8_StreamAPI;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Считать с консоли данные (массив слов). Записать в другую переменную String строку (через запятую слова),
 * длина которых строго больше 6. В конце запятой не должно быть.
 */

public class Lab8_taskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите данные (текст): ");
        String str = in.readLine();
        List<String> words = list(str);
        System.out.print("Слова, длина которых строго больше 6: " + wordsWithCommas(words));
    }

    private static List<String> list(String str) {
        return Arrays.asList(str.replaceAll("[^А-яЁёA-z ]", "").toLowerCase().split(" "));
    }

    private static String wordsWithCommas(List<String> words) {
        return words.stream().filter(word -> word.length() > 6).collect(Collectors.joining(", "));
    }
}
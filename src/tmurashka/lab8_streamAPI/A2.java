package tmurashka.lab8_streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
 * длина которых строго больше 6. В конце запятой не должно быть
 */

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");
        System.out.println(Arrays.stream(strArray).filter(word -> !(word.isEmpty() || word.length() < 7)).collect(Collectors.joining( "," )));
    }
}

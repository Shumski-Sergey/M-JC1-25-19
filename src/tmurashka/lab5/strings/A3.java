package tmurashka.lab5.strings;

// Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[ .!?,:;]");
        StringBuilder text = new StringBuilder();
        for (String word: strArray) {
            if(word.isEmpty()) {
                continue;
            }
            text.append(word.charAt(word.length() - 1));
        }
        System.out.println(text);
    }
}

package dSankovsky.Collections.B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class B1 {
    public static void main(String[] args) throws IOException {
        String[] words = EnterTheText();
        Map<String, Integer> dictionary = new HashMap<>();
        MakeDictionary(words, dictionary);
        System.out.println();
        System.out.println(dictionary);
    }

    public static String[] EnterTheText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Text: ");
        String text = reader.readLine();
        text.toLowerCase();
        Pattern pattern = Pattern.compile("[)]*[,.!?]*\\s+[(]*");
        return pattern.split(text);
    }

    public static void MakeDictionary(String[] words, Map<String, Integer> dictionary) {
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                dictionary.replace(word, dictionary.get(word).intValue() + 1);
            } else {
                dictionary.put(word, 1);
            }
        }
    }
}

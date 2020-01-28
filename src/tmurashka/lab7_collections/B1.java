package tmurashka.lab7_collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// Имеется текст. Следует составить для него частотный словарь

public class B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");
        Map<String, Integer> dictionary = new HashMap<>();
        for (String word : strArray) {
            if (word.isEmpty()) {
                continue;
            }
            Integer value = dictionary.get(word);
            if (value == null) {
                dictionary.put(word, 1);
            }
            else {
                dictionary.put(word, value + 1);
            }
        }
        for(Map.Entry<String, Integer> item : dictionary.entrySet()){

            System.out.printf("word: %s  count: %d \n", item.getKey(), item.getValue());
        }
    }

}

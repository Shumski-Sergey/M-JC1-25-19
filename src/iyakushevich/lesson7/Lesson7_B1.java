package iyakushevich.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * B1.Имеется текст. Следует составить для него частотный словарь
 */

public class Lesson7_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = bufferedReader.readLine();

        Map<String, Integer> dictionary = new HashMap<>();
        String[] words = text.split("[^A-zА-я]|\n");

        int counter;
        for (String word : words
        ) {
            if (dictionary.containsKey(word)) {
                counter = dictionary.get(word);
            } else counter = 0;
            dictionary.put(word, counter + 1);
        }

        System.out.println();
        System.out.println(dictionary);

        List<Integer> wordCountList = new ArrayList<>(dictionary.values());
        System.out.println(wordCountList);
        Collections.sort(wordCountList);
        System.out.println(wordCountList);

        for (int i = wordCountList.get(wordCountList.size() - 1); i > 0; i--) {
            for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(i)) System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

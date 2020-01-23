package iyakushevich.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * B1.Имеется текст. Следует составить для него частотный словарь
 */

public class Lesson7_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = bufferedReader.readLine();

        Map<String, Integer> dictionary = new HashMap<>();
        String[] words = text.split("[^A-zА-я]");

        int counter;
        for (String word : words
        ) {
            if (dictionary.containsKey(word)) {
                counter = dictionary.get(word);
            } else counter = 0;
            dictionary.put(word, counter + 1);
        }

        System.out.println(dictionary);

        //TODO
        //sort Map by values
    }
}

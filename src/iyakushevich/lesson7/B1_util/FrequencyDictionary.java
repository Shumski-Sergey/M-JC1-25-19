package iyakushevich.lesson7.B1_util;

import java.util.*;

public abstract class FrequencyDictionary {

    public static void countWords(String text) {
        Map<String, Integer> dictionary = new HashMap<>();
        String[] words = text.split("[^А-яЁёA-z]+");

        int counter;
        for (String word : words
        ) {
            if (dictionary.containsKey(word)) {
                counter = dictionary.get(word);
            } else counter = 0;
            dictionary.put(word, counter + 1);
        }

        System.out.println();
        List<Integer> wordCountList = new ArrayList<>(dictionary.values());
        Collections.sort(wordCountList);

        for (int i = wordCountList.get(wordCountList.size() - 1); i > 0; i--) {
            for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(i)) System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}

package src.aProtasenia.Collections.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    Map<String, Integer> hashMapDictionary = new HashMap<>();

    public Dictionary(String text) {
        Pattern pattern = Pattern.compile("[A-z]+");
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            String dictionaryWords = matcher.group();
            if (hashMapDictionary.containsKey(dictionaryWords)) {
                hashMapDictionary.put(dictionaryWords, hashMapDictionary.get(dictionaryWords) + 1);
            } else hashMapDictionary.put(dictionaryWords, 1);
        }
    }
    public void getWordsFrequency() {
        hashMapDictionary.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                forEach(System.out::println);
    }
}

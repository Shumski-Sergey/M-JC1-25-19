package dbesan.lab9collections.uniqueletters.util;

import java.util.HashMap;
import java.util.Map;

public class UniqueLowerCase {
    private Map<Character, Integer> map = new HashMap<>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void calculate() {
        for (char character : text.toCharArray()) {
            if (Character.isLowerCase(character)) {
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += "char: " + entry.getKey() +
                    "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}



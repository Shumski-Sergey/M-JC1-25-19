package dbesan.lab9collections.uniqueletters.service;

import dbesan.lab9collections.uniqueletters.service.impl.UniqueService;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars implements UniqueService {
    private Map<Character, Integer> map = new HashMap<>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void calculateUniqueChars() {
        for (char character : text.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
    }

    public void calculateUniqueDigits() {
        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
    }

    public void calculateUniqueLetters() {
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                if (map.containsKey(character)) {
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }
        }
    }

    public void calculateUniqueLowerCase() {
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

    public void calculateUniqueUpperCase() {
        for (char character : text.toCharArray()) {
            if (Character.isUpperCase(character)) {
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
        System.out.println("Результат:");
        String result = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += "char: " + entry.getKey() +
                    "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}



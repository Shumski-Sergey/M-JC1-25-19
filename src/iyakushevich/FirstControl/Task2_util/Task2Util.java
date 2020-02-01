package iyakushevich.FirstControl.Task2_util;

import java.util.ArrayList;
import java.util.List;

public class Task2Util {

    //convert String to Character ArrayList
    public static List<Character> strToCharList(String line) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            characters.add(line.charAt(i));
        }
        return characters;
    }

    //replaces every even element of list with it left neighbour
    private static int DIVIDER = 2;
    public static List<Character> replaceEven(List<Character> charList) {
        for (int i = 1; i < charList.size(); i++) {
            if (i % DIVIDER == 0) charList.set(i, charList.get(i - 1));
        }
        return charList;
    }

}

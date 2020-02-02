package src.aProtasenia.FirstControl.Task_2;

import java.util.ArrayList;
import java.util.List;

public class listFilling {
    public static List<Character> strToChar(String str) {
        List<Character> listItems = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            listItems.add(str.charAt(i));
        }
        System.out.println("You entered:  " + listItems);
        return listItems;
    }

    public static void replacedList(List<Character> replacedChar) {
        for (int i = 1; i < replacedChar.size(); i+=2) {
            replacedChar.set(i, replacedChar.get(i-1));
        }
        System.out.println("You received: " + replacedChar);
    }
}




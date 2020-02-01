package dbesan.firstcontrol.services;

import dbesan.firstcontrol.services.impl.UniqueService;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static dbesan.firstcontrol.util.Constants.COUNTTHIRDMISSION;
import static dbesan.firstcontrol.util.InputText.Text;

public class LongString implements UniqueService {
    private static String text;
    private static Map<String, Integer> map = new TreeMap<>(); //uses for saving strings and lenght
    private static int maxCount = 0; //uses for count of longest strings

    public static void longest() {
        ArrayList<String> list = new ArrayList<>();
        Scanner TextScanner = new Scanner(System.in);
        int countStrings = 0; //how much strings
        for (int i = 0; i < COUNTTHIRDMISSION; i++) {
            //cycle saving strings in array and its count
            list.add(Text());
            countStrings++;
        }
        for (int i = 0; i < countStrings; i++) {
            //cycle calculate lenght of strings (im know about String.lenght();
            // but, when my mind understand it, all logics was created
            char[] texting = list.get(i).toCharArray();
            map.put(list.get(i), texting.length);
        }
        int max = 0;
        Map<String, Integer> tempmap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //seaching for max lenght
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> tempentry : map.entrySet()) {
            //chacknig, what if strings with max lenght more than one
            if (max == tempentry.getValue()) {
                maxCount++;
                tempmap.put(tempentry.getKey(), tempentry.getValue());
            }
        }

        map = tempmap;
    }

    @Override
    public String toString() {
        System.out.println("Результат:");
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += "Самая длинная строка: " + entry.getKey() + " " +
                    "Длиной: " + entry.getValue() + "\n";
        }
        return result;
    }
}
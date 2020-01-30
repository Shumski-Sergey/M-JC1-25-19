package iyakushevich.FirstControl.Task1_util;

import java.util.ArrayList;
import java.util.List;

public class Task1Util {

    //converts string to integer list
    public static List<Integer> convertToNumList(String line) {
        String digits = line.replaceAll("\\D", "");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            integerList.add(Integer.parseInt(String.valueOf(digits.charAt(i))));
        }
        return integerList;
    }

    //counts sum of digits from list
    public static int intListSum(List<Integer> intList) {
        int sum = 0;
        for (Integer digit : intList) {
            sum += digit;
        }
        return sum;
    }
}

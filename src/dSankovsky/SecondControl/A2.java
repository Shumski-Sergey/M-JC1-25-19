package dSankovsky.SecondControl;

import java.util.*;
import java.util.stream.Stream;

public class A2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 100, 60, 1, 10, 20, 20, 70, 54,70,70,70,70,70));
        Map<Integer, Integer> intMap = new HashMap<>();

        CountNumbersRepeat(list, intMap);
        FindMaxNumbersRepeat(list, intMap);

    }

    private static void FindMaxNumbersRepeat(List<Integer> list, Map<Integer, Integer> intMap) {
        for (int x : list) {
            if (intMap.get(x).equals(intMap.values().stream().max(Integer::compareTo).get())) {
                System.out.println("Number: " + x + " Repeat: " + intMap.get(x));
                break;
            }
        }
    }

    private static void CountNumbersRepeat(List<Integer> list, Map<Integer, Integer> intMap) {
        for (Integer numb : list) {
            if (intMap.containsKey(numb)) {
                intMap.replace(numb, intMap.get(numb) + 1);
            } else {
                intMap.put(numb, 1);
            }
        }
    }
}

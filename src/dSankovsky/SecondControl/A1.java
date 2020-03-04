package dSankovsky.SecondControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 100, 60, 1));
        int max = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        int min = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
        System.out.println("Min = " + min + "; Max = " + max);

        FindListSum(list, max, min);
    }

    private static void FindListSum(List<Integer> list, int max, int min) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max || list.get(i) == min)
                list.remove(i);
        }
        Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println("Sum of elements: " + sum);
    }
}

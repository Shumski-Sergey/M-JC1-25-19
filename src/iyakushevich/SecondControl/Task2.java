package iyakushevich.SecondControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2. Найти в массиве число, которое повторяется наибольшее количество раз.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 2, 5, 1, 2, 2, 3, 5, 2, 4, 2};
        System.out.print("Создан новый массив: ");
        printArray(ints);
//        List<Integer> integerList = arrayToList(ints);
        Map<Integer, Long> map = createFrequencyMap(arrayToList(ints));

        System.out.println("\nСамое частое число: " + map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
    }

    private static void printArray(int[] ints) {
        for (int num:ints
             ) {
            System.out.print(num + " ");
        }
    }

    private static Map<Integer, Long> createFrequencyMap(List<Integer> integerList) {
        return integerList.stream()
                    .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
    }

    private static List<Integer> arrayToList(int[] ints) {
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }
}

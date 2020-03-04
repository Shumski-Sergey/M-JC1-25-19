package tmurashka.control;

import java.util.*;

/**
 * Найти в массиве число, которое повторяется наибольшее количество раз
 */

public class Task2 {
    public static void main(String[] args) {
        Map.Entry<Integer, Integer> maxEntry = createMap(randomNumbers())
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get();
        System.out.println("\nMost frequent number is: " + maxEntry.getKey());
    }

    private static ArrayList<Integer> randomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        new Random().ints(10, 0, 10).forEach(n -> {
            numbers.add(n);
            System.out.print(n + " ");
        });
        return numbers;
    }

    private static Map<Integer, Integer> createMap(ArrayList<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            Integer value = map.get(number);
            map.put(number, value == null ? 1 : value + 1);
        }
        return map;
    }
}

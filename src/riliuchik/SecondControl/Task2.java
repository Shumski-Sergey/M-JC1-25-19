package riliuchik.SecondControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static riliuchik.SecondControl.Utils.getArray;
import static riliuchik.SecondControl.Utils.getKeys;
import static riliuchik.SecondControl.Utils.printMostFrequentNumbers;

/**
 * Найти в массиве число, которое повторяется наибольшее количество раз.
 */

public class Task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = getArray();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (Integer number : array)
            frequency.put(number, Collections.frequency(array, number));
        Integer mostFrequency = Collections.max(frequency.values());
        Integer[] keys = getKeys(frequency);
        printMostFrequentNumbers(frequency, mostFrequency, keys);
    }
}
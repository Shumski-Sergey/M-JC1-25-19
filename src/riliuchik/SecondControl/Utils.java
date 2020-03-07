package riliuchik.SecondControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
    public static ArrayList<Integer> getArray() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов в массиве: ");
        int size = Integer.parseInt(in.readLine());
        System.out.println("Введите числа для добавления в массив:");
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) array.add(Integer.parseInt(in.readLine()));
        return array;
    }

    public static Integer[] getKeys(HashMap<Integer, Integer> map) {
        return map.keySet().toArray(new Integer[0]);
    }

    public static void printMostFrequentNumbers(HashMap<Integer, Integer> frequency, Integer mostFrequency, Integer[] keys) {
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(keys[i]).equals(mostFrequency)) numbers.add(keys[i].toString());
        }
        String mostFrequentNumbers = String.join(", ", numbers);
        System.out.print("Числа, которые встречаются наибольшее количество (" + mostFrequency + ") количество раз: " + mostFrequentNumbers);
    }
}
package riliuchik.lab10_InputOutput.Lab10_taskA1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

/**
 * Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */

public class Lab10_taskA1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите путь к файлу (например, src/riliuchik/lab10_InputOutput/Lab10_taskA1/input.txt): ");
        FileInputStream input = new FileInputStream(in.readLine());
        HashMap<Integer, Integer> frequency = getFrequency(input);
        input.close();
        getMostFrequentBytes(frequency);
    }

    private static HashMap<Integer, Integer> getFrequency(FileInputStream input) throws IOException {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int key;
        while ((key = input.read()) != -1) {
            frequency.merge(key, 1, Integer::sum);
        }
        return frequency;
    }

    private static void getMostFrequentBytes(HashMap<Integer, Integer> frequency) {
        int maxFrequency = Collections.max(frequency.values());
        System.out.print("Байт(-ы) с максимальным (" + maxFrequency + ") количеством повторов:");
        frequency.forEach((key, value) -> {
            if (value == maxFrequency) System.out.print(" " + key);
        });
    }
}
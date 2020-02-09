package riliuchik.lab7_collections.fileMapSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

/**
 * Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
 */

public class Lab7_2_taskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов в массиве: ");
        int size = Integer.parseInt(in.readLine());
        System.out.println("Введите элементы для добавления в массив:");
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) map.put(i, in.readLine());
        HashSet<String> unique = new HashSet<>(map.values());
        for (String element : unique)
            System.out.println(element + " повторяется " + Collections.frequency(map.values(), element) + " раз(-а)");
    }
}
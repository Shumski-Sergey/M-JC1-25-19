package riliuchik.lab7_collections.fileMapSet;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
 * Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 */

public class Lab7_2_taskA1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите набор чисел в виде одной строки: ");
        String str = in.readLine();
        HashSet<String> uniqueNumbers = new HashSet<>(Arrays.asList(str.split("(\\s+|,)+")));
        System.out.print("Строка без повторяющихся элементов: " + uniqueNumbers);
    }
}
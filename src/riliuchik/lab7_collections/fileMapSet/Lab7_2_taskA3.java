package riliuchik.lab7_collections.fileMapSet;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Пользователь вводит через один пробел слова.
 * Найти все группы анаграмм (слов, составленных из одних и тех же букв)
 * в этой строке и вывести в консоль их каждую с новой строки,
 * все слова должны идти через пробел в порядке, в котором они встречаются в строке.
 * При этом допускается выводить одинаковые слова в одной строке анаграмм.
 * Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
 *
 * Входная строка: «123 456 231 546 231 312 4556»
 *
 * Результат:
 * 123 231 231 312
 * 456 546
 * 4556
 *
 * Слова с разным регистром букв не будут являться анаграммами.
 * Решается данная проблема с помощью комманды, которая переводит всю строку к строчному виду:
 * text = text.toLowerCase;
 */

public class Lab7_2_taskA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите через один пробел слова: ");
        String[] words = in.readLine().toLowerCase().split(" ");
        LinkedHashMap<String, String> anagrams = new LinkedHashMap<>();
        for (String wordForCheck : words) {
            char[] symbols = wordForCheck.toCharArray();
            Arrays.sort(symbols);
            String setOfSymbols = new String(symbols);
            anagrams.merge(setOfSymbols, wordForCheck, (oldVal, newVal) -> oldVal + " " + newVal);
        }
        System.out.println("Найдены следующие группы анаграмм:");
        for (String group : anagrams.values()) System.out.println(group);
    }
}
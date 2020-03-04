package iyakushevich.SecondControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
 * а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите числа, разделяя их точной или запятой: ");
        String st = readFromConsole();

        String max = getMaxValue(st);
        String min = getMinValue(st);
        int sum = getSum(st, max, min);

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Сумма, за вычетом минимального и максимального: " + sum);
    }

    private static int getSum(String st, String max, String min) {
        return Stream.of(st.split("[ ,.]+")).filter(x -> !x.equals(max)).filter(x -> !x.equals(min))
                    .mapToInt(Integer::valueOf).sum();
    }

    private static String getMinValue(String st) {
        return Stream.of(st.split("[ ,.]+")).min(Comparator.comparing(Integer::valueOf)).get();
    }

    private static String getMaxValue(String st) {
        return Stream.of(st.split("[ ,.]+")).max(Comparator.comparing(Integer::valueOf)).get();
    }

    private static String readFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        try {
            st = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return st;
    }
}

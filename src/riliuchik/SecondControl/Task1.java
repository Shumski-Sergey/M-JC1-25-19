package riliuchik.SecondControl;

import java.io.IOException;
import java.util.ArrayList;

import static riliuchik.SecondControl.Utils.getArray;

/**
 * Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями.
 * Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).
 */

public class Task1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = getArray();
        int max = array.stream().max(Integer::compare).get();
        System.out.print("Наибольшее значение в масисве: " + max);
        int min = array.stream().min(Integer::compare).get();
        System.out.print("\nНаименьшее значение в массиве: " + min);
        int sum = 0;
        for (int number : array)
            if (number != max && number != min) sum += number;
        System.out.print("\nСумма всех остальных элементов массива (" + max + " и " + min + " не входят): " + sum);
    }
}
package aProtasenia.SecondControl;

/*1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static final int grades = 20;
    public static final int randomMax = 10;

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < grades; i++) {
            list.add(randomNumber.nextInt(randomMax));
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        int sum = 0;
        for (Integer i: list)
            sum +=i;

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("Сумма чисел массива: "+ sum);
        System.out.println("Сумма чисел массива без минимального и максимального числа: " + (sum-max-min));

            }
        }


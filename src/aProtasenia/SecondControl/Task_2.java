package aProtasenia.SecondControl;
//Найти в массиве число, которое повторяется наибольшее количество раз.

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {
    public static final int grades = 20;
    public static final int randomMax = 10;

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < grades; i++) {
            list.add(randomNumber.nextInt(randomMax));
        }
        System.out.println(list);
        int num, max, count;
        num = max = count = 0;


        for (Integer i : list) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                num = list.get(i);
            }
            count = 0;
        }
        System.out.println("число, которое повторяется наибольшее количество раз: " + num);
        System.out.println("количество повторений: "+ (max+1));

    }
}
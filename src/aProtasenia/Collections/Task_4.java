package src.aProtasenia.Collections;

/*Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод,который выбирает из заполненного списка элемент наугад 10000 раз.
Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_4 {
    private static final int ARRAYLIST_SIZE = 1000000;
    private static final int DATA_SAMPLING = 10000;
    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();

        long counter = System.currentTimeMillis();
        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            integerArrayList.add(i);
        }
        System.out.println("Time used to add items to the arraylist " +(System.currentTimeMillis()-counter)+ " ms");

        long counter1 = System.currentTimeMillis();
        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            integerLinkedList.add(i);
        }
        System.out.println("Time used to add items to the linkedList: " +(System.currentTimeMillis()-counter)+ " ms");

        Random randomNumber = new Random();
        long counter2 = System.currentTimeMillis();
        for (int i = 0; i < DATA_SAMPLING; i++) {
            int sample = randomNumber.nextInt(ARRAYLIST_SIZE);
            integerArrayList.get(sample);
        }
        System.out.println("Arraylist fetch time for 10000 items " +(System.currentTimeMillis()-counter)+ " ms");

        long counter3 = System.currentTimeMillis();
        for (int i = 0; i < DATA_SAMPLING; i++) {
            int sample = randomNumber.nextInt(ARRAYLIST_SIZE);
            integerLinkedList.get(sample);
        }
        System.out.print("Linkedlist fetch time for 10000 items : " +(System.currentTimeMillis()-counter)+ " ms");
    }
}

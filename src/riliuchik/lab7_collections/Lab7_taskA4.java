package riliuchik.lab7_collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
//Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

public class Lab7_taskA4 {

    private static final int size = 1000000;
    private static final int amount = 10000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }

        long startForArrayList = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) arrayList.get((int) (Math.random() * size)); //значения индексов [0;size)
        long finishForArrayList = System.currentTimeMillis();
        System.out.println("Время, которое потрачено на взятие элемента из ArrayList: " + (finishForArrayList - startForArrayList) + " мс");

        long startForLinkedList = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) linkedList.get((int) (Math.random() * size));
        long finishForLinkedList = System.currentTimeMillis();
        System.out.print("Время, которое потрачено на взятие элемента из LinkedList: " + (finishForLinkedList - startForLinkedList) + " мс");
    }
}
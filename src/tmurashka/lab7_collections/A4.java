package tmurashka.lab7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Напишите метод, который добавляет 1 000 000 элементов в ArrayList и LinkedList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10 000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие

public class A4 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> linked = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            linked.add(rand.nextInt(1000000));
            array.add(rand.nextInt(1000000));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int current = array.get(rand.nextInt(1000000));
        }
        long timeArray = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int current = linked.get(rand.nextInt(1000000));
        }
        long timeLinked = System.currentTimeMillis() - start;

        System.out.println("Array time = " + timeArray + "   List Time = " + timeLinked);
    }
}

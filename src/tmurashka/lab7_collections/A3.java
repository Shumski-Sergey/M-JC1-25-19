package tmurashka.lab7_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора

public class A3 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            marks.add(rand.nextInt(10) + 1);
            System.out.print(marks.get(i) + " ");
        }
        Iterator<Integer> it = marks.iterator();
        int max = 0;
        while (it.hasNext()) {
            int current = it.next();
            if (max < current) {
                max = current;
            }
        }
        System.out.println();
        System.out.println(max);
    }
}

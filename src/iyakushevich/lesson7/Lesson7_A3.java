package iyakushevich.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 3.Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Lesson7_A3 {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            marksList.add((int) (Math.random() * 10));
        }

        int maxMark = marksList.get(0);

        Iterator<Integer> marksIterator = marksList.iterator();
        System.out.println("Сгенерированы следующие оценки: ");
        while (marksIterator.hasNext()) {
            int thisMark = marksIterator.next();
            System.out.print(thisMark + "; ");
            if(maxMark < thisMark) maxMark = thisMark;
        }

        System.out.println('\n' + "Наивысший балл: " + maxMark);
    }
}

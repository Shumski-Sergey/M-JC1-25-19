package iyakushevich.lesson7;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать список оценок учеников с помощью ArrayList, заполнить
 * случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Lesson7_A1 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            marks.add((int) (Math.random() * 10));
        }

        System.out.println("Сгенерированы следующие оценки: ");
        printMarks(marks);
        onlyPositive(marks);
        System.out.println("После удаления отрицательных оценок: ");
        printMarks(marks);
    }

    private static void printMarks(List smth) {
        for (Object o : smth) {
            System.out.print(o + "; ");
        }
        System.out.println();
    }

    private static List<Integer> onlyPositive(List<Integer> smth) {
        List<Integer> subList = new ArrayList<>();
        for (Integer integer : smth) {
            if (integer < 4) subList.add(integer);
        }
        smth.removeAll(subList);
        return smth;
    }
}

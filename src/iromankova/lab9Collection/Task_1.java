package iromankova.lab9Collection;
/*1. Создать список оценок учеников с помощью ArrayList, заполнить
        случайными оценками. Удалить неудовлетворительные оценки из списка.*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            marks.add(random.nextInt(11));
        }
        System.out.println(marks);
        ListIterator<Integer> iterator = marks.listIterator();
        marks.removeIf(mark -> mark < 4);
        System.out.println(marks);

    }
}

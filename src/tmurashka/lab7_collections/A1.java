package tmurashka.lab7_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Создать список оценок учеников с помощью ArrayList, заполнить
случайными оценками. Удалить неудовлетворительные оценки из списка */

public class A1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            marks.add(random.nextInt(10) + 1);
        }
        for (int number : marks) {
            System.out.print(number + " ");
        }
        System.out.println();
        marks.removeIf(mark -> mark < 4);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}

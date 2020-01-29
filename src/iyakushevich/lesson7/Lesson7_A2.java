package iyakushevich.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2.Создать коллекцию, наполнить ее случайными числами. Удалить
 * повторяющиеся числа.
 */

public class Lesson7_A2 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomList.add((int) (Math.random() * 20));
        }
        System.out.println("Сгенерирован следующий ArrayList: ");
        System.out.println(randomList);
        System.out.println("Количество символов: " + randomList.size() + '\n');

        Set<Integer> setList = new HashSet<>(randomList);
        System.out.println("После удаления повторяющихся: ");
        System.out.println(setList);
        System.out.println("Количество символов: " + setList.size());
    }
}

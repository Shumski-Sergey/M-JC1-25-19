package src.aProtasenia.Collections;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            integerList.add((int) (Math.random() * 15));
        }
        System.out.println(integerList);

        Set<Integer> integers = new HashSet<>(integerList);

        System.out.println(integers);
    }
}

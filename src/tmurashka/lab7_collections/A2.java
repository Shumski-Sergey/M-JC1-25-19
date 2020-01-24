package tmurashka.lab7_collections;

import java.util.*;

//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа

public class A2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            collection.add(rand.nextInt(100));
        }
        Set<Integer> set = new HashSet<>();
        collection.forEach(number -> set.add(number));
        set.forEach(number-> System.out.println(number));
    }
}

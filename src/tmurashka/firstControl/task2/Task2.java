package tmurashka.firstControl.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Заменить каждый элемент списка с четным номером на соседний слева элемент
 */

public class Task2 {
    public static void main(String[] args) {
        int arrayCount = 20;
        List<Integer> list = generateArray(arrayCount);
        System.out.println("Input data:");
        printArray(list);
        System.out.println();
        for (int i = 2; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.set(i, list.get(i - 1));
            }
        }
        System.out.println("Result data:");
        printArray(list);
    }

    private static List<Integer> generateArray(int count) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(count));
        }
        return list;
    }

    private static void printArray(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

}

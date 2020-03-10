package aProtasenia.Collections.Map_Set;
//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap

import java.util.HashMap;
import java.util.Map;

public class Task_A2 {
    public static void main(String[] args) {
        int []arr = {3, 3, 99, 99, 99, 99, 57, 77, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Количество цифр" + entry.getKey() + ":   " + entry.getValue());
        }
    }
}

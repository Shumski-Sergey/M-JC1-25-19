package aProtasenia.SecondControl;
/*3. Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
 Выполнить сортировку содержимого по возрастанию и вывести в другой файл(output).*/

import java.io.IOException;
import java.util.*;

public class Task_3 {
    private static final int grades = 20;
    private static final int randomMax = 10;

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < grades; i++) {
            list.add(randomNumber.nextInt(randomMax));
        }
        System.out.println(list);
        for (Integer i : list) {
            if (i == 0){
                list.remove(i);
            }
            if (i % 2==1){
                list.remove(i);
            }
        }
        Set<Integer> treeList = new TreeSet<>(list);
        System.out.println(treeList);


    }
}
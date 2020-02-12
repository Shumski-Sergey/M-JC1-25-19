package src.aProtasenia.Collections.Map_Set;
/*Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
  Избавиться от повторяющихся элементов в строке и вывести результат на экран.*/

import java.util.*;

public class Task_A1 {
    public static void main(String[] args) {
        String data = "1,2,3,4,4,5";
        String[] newString = data.split(",");
        Map<Integer, String> datahashMap = new HashMap<>();

        for (int i = 0; i < newString.length; i++) {
            if (!datahashMap.containsValue(newString[i])) {
                datahashMap.put(i, newString[i]);
            }
        }
        for (String dataString : datahashMap.values()) {
            System.out.print(dataString + ", ");
        }
    }
}

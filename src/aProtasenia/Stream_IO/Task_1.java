package src.aProtasenia.Stream_IO;
//Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter path ( Example: src/aProtasenia/Stream_IO/text )");
        FileInputStream stream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> integerMap = new HashMap<>();
        Set<Integer> integerHashSet = new HashSet<>();
        int i;
        while ((i = stream.read()) != -1) {
            if (integerMap.containsKey(i)) {
                integerMap.replace(i, integerMap.get(i) + 1);
            } else {
                integerMap.put(i, 1);
            }
            integerHashSet.add(i);
        }
        stream.close();

        for (int x : integerHashSet) {
            if (integerMap.get(x).equals(integerMap.values().stream().max(Integer::compareTo).get()))
                System.out.println("Byte: " +  x  + " Count: " + integerMap.get(x));
        }
    }
}

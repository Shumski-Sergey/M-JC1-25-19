package aProtasenia.Streams_IO;

//Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
//Вывести их на экран через пробел. Закрыть поток ввода-вывода.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("src/aProtasenia/Streams_IO/text1");
        Map<Integer, Integer> mapList = new HashMap<>();
        int i;
        Set<Integer> setList = new HashSet<>();
        while ((i = is.read()) != -1) {
            if (mapList.containsKey(i)) {
                mapList.replace(i, mapList.get(i) + 1);
            } else {
                mapList.put(i, 1);
            }
            setList.add(i);
        }
        is.close();

        for (int x : setList) {
            if (Objects.equals(mapList.get(x), mapList.values().stream().max(Integer::compareTo).get()))
                System.out.println("Byte:" + x + " Count:" + mapList.get(x));
        }

        }
    }


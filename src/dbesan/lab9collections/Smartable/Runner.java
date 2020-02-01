package dbesan.lab9collections.Smartable;

import dbesan.lab9collections.Smartable.service.SmartableService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(4);
        SmartableService Smart = new SmartableService();
        System.out.println(Smart.maxOccurrences(list));
        boolean result;
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Вадим", "Вадимов");
        map.put("Илья", "Петров");
        map.put("Игорь", "Игорев");
        result = Smart.isUnique(map);
        System.out.println(result);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Вася", 22);
        map1.put("Петр", 33);
        map1.put("Виктор", 44);
        map1.put("Вадим", 55);
        map1.put("Илья", 66);
        map1.put("Игорь", 77);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Вася", 22);
        map2.put("Петр", 14);
        map2.put("Виктор", 33);
        map2.put("Вадим", 15);
        map2.put("Илья", 16);
        map2.put("Игорь", 77);
        Map<String, Integer> map3 = new HashMap<>();
        System.out.println(Smart.intersect(map1,map2));
    }
}





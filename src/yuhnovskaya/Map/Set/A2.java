package src.yuhnovskaya.Map.Set;
//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2 {
    public static void main(String[] avgs){
        HashMap< Object, Integer> map = new HashMap<>();
        Object[] array={"f", 2, "d", 2, "d", "d", "hey"};
        for(Object o:array) {
            Integer val = map.get(o);
            if (val == null) {
                map.put(o, 1);
            } else {
                map.put(o, val + 1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            System.out.println("Number of "+entry.getKey()+": "+entry.getValue());
        }
    }
}

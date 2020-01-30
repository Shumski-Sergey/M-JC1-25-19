package aantonovich.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа
public class Task2 {
    public  static void  main (String[] args){
        int element = 30;
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < element; i++){
            collection.add(i,(int) (Math.random() * 100 + 1));
        }
        System.out.println(collection);
        Set<Integer> result = new HashSet<>(collection);
        System.out.println(result);
        }
    }


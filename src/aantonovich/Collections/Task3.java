package aantonovich.Collections;

import java.util.ArrayList;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора
public class Task3 {
public  static void main (String[] args){
    int number = 30;
    ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < number; i++){
                list.add(i,(int) (Math.random() * 10 + 1));
            }
    System.out.println(list);
   // System.out.println("Highest rating: " + Collections.max(list));
    int max = list.get(0);
    for(Integer i : list){
        if (i > max)
            max = i;
    }
    System.out.println("Highest rating: " + max);
}
}

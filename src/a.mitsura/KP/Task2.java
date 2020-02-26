package a.mitsura.KP;

import java.util.ArrayList;
import java.util.Collections;
                                            //The task is: Найти в массиве чисел элементы
                                            // с наибольшим(max) и наименьшим(min) значениями.
                                            // Вывести эти 2 элемента на экран,
                                            // а также посчитать и вывести сумму всех остальных элементов
                                            // (min и max в сумму не входят)
public class Task2 {
    public static void main(String [] args){
        //Creating of ArrayList
     ArrayList<Integer> list = new ArrayList<>();
        //Filling of ArrayList by adding values
     list.add(19);
     list.add(52);
     list.add(4);
     list.add(85);
     list.add(47);
        //Sorting of ArrayList by "sort" method from a.mitsura.Collections
        Collections.sort(list);
        //Searching of min and max values of list
     int max=list.size()-1;
     int min=0;
        //Printing max and min values
     System.out.println(list.get(max));
     System.out.println(list.get(min));
        //Deleting of max and min values following the task
        list.remove(max);
        list.remove(min);
        //ArrayList to Array
     Object[] sumArray = list.toArray();
        //Counting the sum of array (without max and min values cause of deleting 'em earlier)
     int sum = 0;
     for(int i=0; i<sumArray.length; i++) {
         sum+=((Integer)sumArray[i]).intValue();
         }
        //And finally printing the su of Array without max and min values. Bingo
      System.out.print(sum);
    }
}

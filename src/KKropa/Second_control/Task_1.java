package KKropa.Second_control;
//1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
//а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).
import java.util.ArrayList;

import java.util.Collections;

import static KKropa.Second_control.Const.QUANTITY_ELEMENTS;


/**
 * Created by user on 04.03.2020.
 */
public class Task_1 {



    public static void main(String[] args)  {

        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        Add_elements(list);


        System.out.println("Max element in list is: " + Collections.max(list));
        System.out.println("Min element in list is: " + Collections.min(list));

        list.remove(Collections.max(list));
        list.remove(Collections.min(list));

        System.out.println("New list without min amd max element " + list);

        for (int i=0; i<list.size(); i++){
            sum = list.get(i)+sum;
        }
        System.out.println("Sum of elements " + sum);

    }

    private static void Add_elements(ArrayList<Integer> list) {
        for (int i = 0; i < QUANTITY_ELEMENTS; i++) {
            int a = (int) (Math.random() * QUANTITY_ELEMENTS + 1);
            list.add(i, a);
        }

        System.out.println("View all list: " + list);
    }
}

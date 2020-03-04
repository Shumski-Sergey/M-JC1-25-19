package KKropa.Second_control;

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

        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            sum = list.get(i)+sum;
        }
        System.out.println(sum);



    }

    private static void Add_elements(ArrayList<Integer> list) {
        for (int i = 0; i < QUANTITY_ELEMENTS; i++) {
            int a = (int) (Math.random() * QUANTITY_ELEMENTS + 1);
            list.add(i, a);
        }

        System.out.println("View all list: " + list);
    }
}

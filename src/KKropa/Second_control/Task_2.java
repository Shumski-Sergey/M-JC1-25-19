package KKropa.Second_control;
//2. Найти в массиве число, которое повторяется наибольшее количество раз.

import java.util.*;



public class Task_2 {
    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,4,4,5,6,7));

        int num=0;
        int max=0;
        int count=0;

        for (int i = 0; i<list.size(); i++){
            for (int j = 0; j<list.size(); j++){
                if (list.get(i)==list.get(j)){
                    count++;
                }
            }
            if (count>max){
                max=count;
                num=list.get(i);
            }
            count=0;
        }
        System.out.println(num + ": " + (max));

    }


}

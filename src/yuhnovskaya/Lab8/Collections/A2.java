package src.yuhnovskaya.Lab8.Collections;
//2.Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import java.util.ArrayList;

public class A2 {
    public static void main(String[] avgs){
        int n=20;
        //filling
        ArrayList<Integer> random=new ArrayList<>();
        for (int i=0; i<n; i++){
            random.add((int)(-100+Math.random()*100));
        }
        System.out.println(random);
        //removing
        ArrayList<Integer>equal=new ArrayList<>();
        for (int i=0; i<n; i++){
            int first=random.get(i);
            for (int j=i+1; j<n;j++){
                int second=random.get(j);
                if (first==second){
                    equal.add(second);
                }
            }
        }
        System.out.println(equal);
        random.removeAll(equal);
        System.out.println(random);
    }
}

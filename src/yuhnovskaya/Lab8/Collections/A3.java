package src.yuhnovskaya.Lab8.Collections;

import java.util.ArrayList;
import java.util.Iterator;

//3.Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class A3 {
    public static void main(String[] avgs){
        int n=20;
        ArrayList<Integer> marks=new ArrayList<>();
        for (int i=0;i<n;i++){
            marks.add((int)(1+Math.random()*10));
        }
        System.out.println(marks);
        int max=marks.get(0);
        Iterator iterator=marks.iterator();
        while (iterator.hasNext()) {
            int next=(int)iterator.next();
            if (next > max) {
                max = next;
            }
        }
        System.out.print("max value="+max);
    }
}

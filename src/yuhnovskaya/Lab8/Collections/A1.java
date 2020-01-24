package src.yuhnovskaya.Lab8.Collections;
//1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка

import java.util.ArrayList;

public class A1 {
    public static void main(String[] avgs) {
        int n = 10;
        //filling
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = (int)(1+Math.random() * 10);
            marks.add( m);
        }
        System.out.println(marks);
        //removing
        ArrayList<Integer>badmarks=new ArrayList<>();
        for (int i=0; i<n; i++){
            int badmark=marks.get(i);
            if (badmark<3){
               badmarks.add(badmark);
            }
        }
        marks.removeAll(badmarks);
        System.out.println(marks);
    }
}

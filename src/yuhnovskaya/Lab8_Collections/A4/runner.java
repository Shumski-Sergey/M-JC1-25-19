package src.yuhnovskaya.Lab8_Collections.A4;

import java.util.ArrayList;
import java.util.LinkedList;

import static src.yuhnovskaya.Lab8_Collections.A4.Method_remove.remove;

public class runner {
    public static void main(String[] avgs){
        //insert into arraylist
        ArrayList ar=new ArrayList();
        Method_add.add(ar);
        System.out.println(ar);

        //remove from linkedlist
        LinkedList lk=new LinkedList();
        for(int i=0; i<10005;i++) {
            lk.add((int) (Math.random() * 10));
        }
        System.out.println(lk);
        remove(lk);
        System.out.println(lk);
    }
}

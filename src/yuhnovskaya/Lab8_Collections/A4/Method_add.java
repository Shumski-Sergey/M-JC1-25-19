package src.yuhnovskaya.Lab8_Collections.A4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Method_add {
    public static void main(String[] avgs) {
        ArrayList array = new ArrayList();
        add(array);
        LinkedList linked = new LinkedList();
        add(linked);
    }

    public static void add(List list) {
        for (int i=0; i<1000000; i++) {
            list.add((int)(Math.random()*10));
        }
    }
}


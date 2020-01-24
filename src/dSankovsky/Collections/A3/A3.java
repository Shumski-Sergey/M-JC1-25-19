package dSankovsky.Collections.A3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//make arraylist, find max value with iterator
public class A3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((1 + (int) (Math.random() *99)));
        }
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
        int max = 0,thisInt;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            thisInt = iterator.next();
            if (thisInt > max) {
                max = thisInt;
            }

        }
        System.out.println("Max Value: "+max);

    }
}

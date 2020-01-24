package dbesan.lab8collections.a3;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> rate = rating.doRate();
        int max = rate.get(0);
        Iterator<Integer> iter = rate.iterator();
        while (iter.hasNext()) {
            if (max < iter.next()) {
                max = iter.next();
            }
        }
        System.out.println(max);
    }
}



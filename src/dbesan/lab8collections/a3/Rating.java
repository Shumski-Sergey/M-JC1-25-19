package dbesan.lab8collections.a3;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Rating {
    public static ArrayList doRate() {
        ArrayList<Integer> rate = new ArrayList();
        for (int i = 0; i < 25; i++) {
            rate.add(i, (int) floor(random() * 10));
            // System.out.print(rate.get(i)+ " ");
        }

        return rate;
    }
}

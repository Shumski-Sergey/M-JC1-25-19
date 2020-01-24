package dbesan.lab8collections;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class rating {
    public static ArrayList doRate() {
        ArrayList<Integer> rate = new ArrayList();
        for (int i = 0; i < 25; i++) {
            rate.add(i, (int) floor(random() * 10));
        }
        System.out.println(rate);
        return rate;
    }
}

package dbesan.lab8collections.a1;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Rating {
    public static ArrayList doRate() {
        ArrayList<Integer> rate = new ArrayList();
        for (int i = 0; i < 25; i++) {
            rate.add(i, (int) floor(random() * 10));
        }

        return rate;
    }
}

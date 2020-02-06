package dbesan.lab8collections.a2;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class GetIntegers {
    static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> rate = new ArrayList();
        for (int i = 0; i < 25; i++) {
            rate.add(i, (int) floor(random() * 100));
            System.out.print(rate.get(i) + " ");
        }
        return rate;
    }
}

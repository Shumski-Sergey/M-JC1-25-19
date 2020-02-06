package dbesan.lab8collections.a1;

import java.util.ArrayList;

import static dbesan.lab8collections.a1.Rating.doRate;
import static dbesan.lab8collections.a1.Runner.NORMAL_RATE;

public class Remover {
    static void remove() {
        ArrayList rate = new ArrayList();
        rate = doRate();
        for (int i = 0; i < rate.size() - 1; i++) {
            if ((int) rate.get(i) < NORMAL_RATE) {
                rate.remove(i);
            } else {
                System.out.print(rate.get(i) + " ");
            }
        }

    }
}

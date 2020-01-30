package dbesan.lab8collections.a1;

import java.util.ArrayList;

import static dbesan.lab8collections.a1.Runner.NORMAL_RATE;

public class remover {
    static void remove() {
        ArrayList rate = new ArrayList();
        rate = rating.doRate();
        for (int i = 0; i < rate.size() - 1; i++) {
            if ((int) rate.get(i) < NORMAL_RATE) {
                rate.remove(i);
            } else {
                System.out.print(rate.get(i) + " ");
            }
        }

    }
}

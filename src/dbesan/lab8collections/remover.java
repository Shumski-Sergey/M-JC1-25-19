package dbesan.lab8collections;

import java.util.ArrayList;

import static dbesan.lab8collections.Runner.NORMAL_RATE;

public class remover {
    private static void remover() {
        ArrayList rate = new ArrayList();
        rate = rating.doRate();
        for (int i = 0; i < rating.doRate().size(); i++) {
            if ((int) rating.doRate().get(i) < NORMAL_RATE) {
                rating.doRate().remove(i);
            }
        }
System.out.println(rate);
    }
}

package dbesan.lab8collections.a1;

import java.util.ArrayList;

import static dbesan.lab8collections.a1.Runner.NORMAL_RATE;

public class remover {
    private static void remover() {
        ArrayList rate = new ArrayList();
        rate = rating.doRate();
        for (int i = 0; i < rating.doRate().size(); i++) {
            if ((int) rating.doRate().get(i) < NORMAL_RATE) {
                rating.doRate().remove(i);
            }
            for (int j = 0; j < rating.doRate().size(); i++){
                System.out.print(rate.get(i)+ " ");
            }
        }

    }
}

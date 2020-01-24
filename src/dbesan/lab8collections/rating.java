package dbesan.lab8collections;

import java.util.ArrayList;
import static java.lang.Math.floor;
import static java.lang.Math.random;

public class rating {
    public static void doRate() {
        ArrayList rate = new ArrayList();
        for (int i = 0; i < 25; i++) {
            rate.add(floor(random()*10));
        }
    }
}

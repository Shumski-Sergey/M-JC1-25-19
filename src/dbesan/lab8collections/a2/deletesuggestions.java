package dbesan.lab8collections.a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class deletesuggestions {
    static void deletesuggestions(ArrayList<Integer> rate) {
        System.out.println();
        Set<Integer> rate1 = new HashSet();
        rate1.addAll(rate);
        rate.clear();
        rate.addAll(rate1);
        Collections.sort(rate);
    }
}

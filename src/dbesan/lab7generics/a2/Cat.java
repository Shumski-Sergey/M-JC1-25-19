package dbesan.lab7generics.a2;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Cat<T> {
    public static ArrayList catList() {
        ArrayList catlst = new ArrayList();
        for (int i = 0; i < 25; i++) {
            catlst.add(i, (int) floor(20 + random() * 20));
        }

        return catlst;
    }
}
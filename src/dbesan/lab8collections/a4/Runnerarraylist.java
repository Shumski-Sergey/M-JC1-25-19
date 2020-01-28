package dbesan.lab8collections.a4;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Runnerarraylist {
    public static void main(String[] args) {

        ArrayList<Integer> rate = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            rate.add(i, (int) floor(random() * 1000000));
        }
        for (int i = 0; i < 10000; i++) {
            rate.get((int) floor(random() * 10000));
        }
    }
}
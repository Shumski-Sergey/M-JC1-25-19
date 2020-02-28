package a.mitsura.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Task2 {

    public static final int RANDOM = 14;
    public static final int RANDOM_VALUE = 10;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < RANDOM; i++) {
            list.add((int) (Math.random() * RANDOM_VALUE));
        }
        System.out.println("All the marks are: " +list);
        Set<Integer> newList = new HashSet<>(list);
        System.out.println(newList);
    }
}
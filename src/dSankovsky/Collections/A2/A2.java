package dSankovsky.Collections.A2;

import java.util.HashSet;
import java.util.Set;
//create collection, add random int and delete copies
public class A2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(((int) (Math.random() * 100)));
        }
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Collection size: "+set.size());
    }
}

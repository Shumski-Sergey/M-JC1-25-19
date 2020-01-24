package dSankovsky.Collections.A1;

import java.util.ArrayList;
import java.util.List;
//make list and remove all negative value
public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((1 + (int) (Math.random() * 9)));
        }
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
                i--;
            }
        }
        for (int x : list) {
            System.out.print(x + " ");
        }


    }
}

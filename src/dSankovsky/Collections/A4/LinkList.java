package dSankovsky.Collections.A4;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add((1 + (int) (Math.random() * 1000000)));
        }
        Choosen(list);
    }

    static void Choosen(List list) {
        int chose;
        for (int i = 0; i < 10000; i++) {
            chose = (int) list.get((int) (Math.random() * list.size()));
            System.out.println(chose);
        }
    }
}

//TIME is about 11 seconds +- 200 ms

package dSankovsky.Collections.A4;

import java.util.ArrayList;
import java.util.List;

public class ArrListInMiddle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add((1 + (int) (Math.random() *1000000)));
        }
        Choosen(list);
    }
    static void Choosen(List list){
        int chose=0;
        for (int i = 0; i<10000;i++){
            list.add(500000+i);
            //list.remove(500000+i);
            System.out.println("Add");
            //System.out.println("Remove");
        }
    }
}

// Time is about 3.5 seconds +-200 ms  - remove
// Time is about 0.8 seconds +-100 ms  - add
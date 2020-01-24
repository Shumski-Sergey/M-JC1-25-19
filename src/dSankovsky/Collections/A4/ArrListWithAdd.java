package dSankovsky.Collections.A4;

import java.util.ArrayList;
import java.util.List;

public class ArrListWithAdd {
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
            //list.add(0+(int)(Math.random()*list.size()),(1 + (int) (Math.random() *1000000)));
            list.remove((int)(Math.random()*list.size()));
            //System.out.println("Add");
            System.out.println("Remove");
        }
    }
}
// Time is about 6.5 seconds +-200 ms  - remove
// Time is about 7 seconds +-200 ms  - add
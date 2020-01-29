package dSankovsky.Collections.A4;

import java.util.ArrayList;
import java.util.List;

public class ArrListFromBeginning {
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
            list.add(i);
            //list.remove(i);
            System.out.println("Add");
            //System.out.println("Remove");
        }
    }
}
// Time is about 1 seconds +-200 ms  - add
// Time is about 15.5 seconds +-100 ms  - remove
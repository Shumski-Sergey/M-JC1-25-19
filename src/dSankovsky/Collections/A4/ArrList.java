package dSankovsky.Collections.A4;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add((1 + (int) (Math.random() *1000000)));
        }
        Choosen(list);
    }
    static void Choosen(List list){
        int chose;
        for (int i = 0; i<10000;i++){
            chose=(int)list.get((int) (Math.random() * list.size()));
            System.out.println(chose);
        }
    }
}

//TIME is about 1 second +-200 ms
package src.yuhnovskaya.Lab8.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Method_remove {
        public static void main(String[] avgs) {
        ArrayList array = new ArrayList();
        remove(array);
        LinkedList linked = new LinkedList();
        remove(linked);
    }
    public static void remove(List list) {
        for (int i=0; i<10000; i++){
            list.remove(0);
        }
    }
}

package dbesan.lab7generics.a2;

import java.util.ArrayList;

import static dbesan.lab7generics.a2.Runner.IO_COUNT;

public class doit<T> {

    public static void doit() {
        ArrayList catlst = new ArrayList();
        int[] arr = new int[IO_COUNT];
        catlst = Cat.catList();

        for (int i = 0; i < IO_COUNT; i++) {
            arr[i] = (int) catlst.get(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package dbesan.lab2;

import java.util.Arrays;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args) {
        Integer[] myArrayInt = {1, 2, 3, 4, 5};
        Arrays.sort(myArrayInt, Collections.reverseOrder());
        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + " ");
        }


    }
}
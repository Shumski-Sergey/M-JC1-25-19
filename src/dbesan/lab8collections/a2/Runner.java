package dbesan.lab8collections.a2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> rate = getIntegers.getIntegers();
        deletesuggestions.deletesuggestions(rate);
        for (int i = 0; i < rate.size(); i++) {
            System.out.print(rate.get(i) + " ");
        }
    }

}

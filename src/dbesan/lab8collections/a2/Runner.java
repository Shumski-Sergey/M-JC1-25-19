package dbesan.lab8collections.a2;

import java.util.ArrayList;

import static dbesan.lab8collections.a2.Deletesuggestions.deletesuggestions;
import static dbesan.lab8collections.a2.GetIntegers.getIntegers;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> rate = getIntegers();
        deletesuggestions(rate);
        for (int i = 0; i < rate.size(); i++) {
            System.out.print(rate.get(i) + " ");
        }
    }

}

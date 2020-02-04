package question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public  void maximum() {
        final int size = 5;

        //creating the list of strings
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            System.out.print(" Enter the String for " + i + " index: ");
            str.add(sc.nextLine());
        }
        System.out.print("The list of strings is: " + str);


        //finding the longest string
        int max = str.get(0).length();
        for (int i = 0; i < size; i++) {
            if (max <= str.get(i).length()) {
                max = str.get(i).length();

            }
        }


        //displaying the longest string
        for (int i = 0; i < size; i++) {
            if (str.get(i).length() == max) {
                System.out.print("\nThe longest string with the index " + i + ": " + str.get(i));
            }
        }
    }
}


package src.skarpen.first_control.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodArrays {
    public void SortsByLength() {
        /*
         *** Create an array of five Strings
         */
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> finalArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= Constants.NUMDERSTRINGS; i++) {
            System.out.print("Input string number " + i + ": ");
            arrayList.add(scanner.nextLine());
        }
        /*
         ***  Sort array by string length
         */

        System.out.println("Your massive string: " + arrayList.toString());
        int MaxLargestString = arrayList.get(0).length();
        int indexMaxString = 0;

        for (int j = 0; j < Constants.NUMDERSTRINGS; j++) {
            if (arrayList.get(j).length() > MaxLargestString) {
                MaxLargestString = arrayList.get(j).length();
                indexMaxString = j;
            }
        }
        /*
         ***  Find the same length strings and print them
         */
        for (int d = 0; d < Constants.NUMDERSTRINGS; d++) {
            if (arrayList.get(indexMaxString).length() == arrayList.get(d).length()) {
                finalArrayList.add(arrayList.get(d));
            }
        }
        System.out.println("Same string length" + " " + finalArrayList.toString());
        scanner.close();
        System.out.println("The end");
    }
}

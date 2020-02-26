package a.mitsura.FirstControl;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
//        with scanner user entered the number of lines
        int n = getNumberOfLines();
        ArrayList<String> list = new ArrayList<>(n);
//        fillig arraylist with scanner
        filingArrayList(n, list);
//        searching the max length among the lines
        int maxLength = getMaxLength(list);
//        searching the longest line
        theLongestLine(list, maxLength);
    }

    public static void theLongestLine(ArrayList<String> list, int maxLength) {
        for (String s : list) {
            if (s.length() == maxLength) {
                System.out.println("The longest line is "+s);
            }
        }
    }

    public static void filingArrayList(int n, ArrayList<String> list) {
        for (int i = 0; i < n; i++) {
            Scanner line = new Scanner(System.in);
            System.out.println("text the line");
            String text = line.nextLine();
            list.add(text);
        }
    }

    public static int getNumberOfLines() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much lines there will be created?");
        return sc.nextInt();
    }

    public static int getMaxLength(ArrayList<String> list) {
        int maxLength = list.get(0).length();
        for (String temp : list) {
            if (temp.length() > maxLength) {
                maxLength = temp.length();
            }
        }
        return maxLength;
    }
}
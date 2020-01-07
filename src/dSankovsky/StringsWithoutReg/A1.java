package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Find max/min line and length
public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        String numb = reader.readLine();
        int numbOfLines = Integer.parseInt(numb);
        String[] arr = new String[numbOfLines];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the line");
            arr[i] = reader.readLine();
        }
        int maxLine = 1, minLine = 1, maxNumb = 0, minNumb = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                maxLine = arr[i].length();
                minLine = arr[i].length();
            }
            if (arr[i].length() > maxLine) {
                maxLine = arr[i].length();
                maxNumb = i;
            } else if (arr[i].length() < minLine) {
                minLine = arr[i].length();
                minNumb = i;
            }
        }
        System.out.println("Max Line: " + arr[maxNumb] + " Length: " + maxLine);
        System.out.println("Min Line: " + arr[minNumb] + " Length: " + minLine);
    }
}


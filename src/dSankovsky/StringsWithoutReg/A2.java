package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//sorting and print lines from short to long
public class A2 {
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

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String x : arr) {
            System.out.println(x);
        }
    }
}

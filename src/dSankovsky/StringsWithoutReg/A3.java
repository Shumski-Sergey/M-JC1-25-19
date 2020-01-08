package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//print line which length is shorter than average
public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        String numb = reader.readLine();
        int numbOfLines = Integer.parseInt(numb);
        String[] arr = new String[numbOfLines];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the line");
            arr[i] = reader.readLine();
            sum += arr[i].length();
        }
        sum = sum / numbOfLines;
        for (String x : arr) {
            if (x.length() < sum) {
                System.out.println("Line: " + x + " Length: " + x.length());
            }
        }
    }
}

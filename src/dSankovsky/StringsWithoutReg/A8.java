package dSankovsky.StringsWithoutReg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//print only number-polynom

public class A8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        String numb = reader.readLine();
        int numbOfLines = Integer.parseInt(numb);
        String[] wordArr = new String[numbOfLines];

        for (int i = 0; i < wordArr.length; i++) {
            System.out.println("Enter the line");
            wordArr[i] = reader.readLine();
        }
        boolean isFirst = false, isPrinted = false;
        String firstLine = null;
        for (int j = 0; j < wordArr.length; j++) {
            if (isPrinted) {
                break;
            }
            char[] letterArr = wordArr[j].toCharArray();
            for (int i = 0; i < letterArr.length / 2; i++) {
                if ((!Character.isDigit(letterArr[i]) || !Character.isDigit(letterArr[letterArr.length - 1 - i]) || !Character.isDigit(letterArr[letterArr.length / 2]))) {
                    break;   //number validation
                }
                if (letterArr[i] != letterArr[letterArr.length - 1 - i]) {
                    break;    //polynom validation
                }
                if (isFirst) {   //second line validation
                    System.out.println("Your polynom is " + wordArr[j]);
                    isPrinted = true;
                    break;
                } else {
                    isFirst = true;
                    firstLine = wordArr[j];
                }
                if (isFirst && j == wordArr.length - 1) {   //one line validation
                    System.out.println("Your polynom is " + firstLine);
                }
            }
        }
    }
}







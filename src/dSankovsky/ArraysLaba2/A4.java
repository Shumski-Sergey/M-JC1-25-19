package dSankovsky.ArraysLaba2;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
//make array in butterfly style
        int[][] arr = new int[21][21];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < (arr.length)-i; j++) {    //this line move collumns to right and cut left columns
                arr[i][j] = 1;
                arr[(arr.length-1) - i][j] = 1;     //this is movement down-up
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

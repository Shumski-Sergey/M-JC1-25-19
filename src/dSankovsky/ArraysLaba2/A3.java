package dSankovsky.ArraysLaba2;


import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
//make array, print, transpose, print again
        Scanner in = new Scanner(System.in);    //using scanner
        System.out.println("Set array size NxN:");
        int size = in.nextInt();
        System.out.println("First array:");
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);  //add random numbers in array
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {   // transpose array
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {   //print new transposed array
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


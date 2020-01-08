package d.grigirchik.lab4.Arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 0 + (int) (Math.random() * 100);
           System.out.print(mas[i] + " ");
//            System.out.println(mas[9 - i] + " ");
        }
        System.out.println("flipping an array");
        for (int i = mas.length-1; i >=0; i--) {
            System.out.print(mas[i]+ " ");
        }
    }
}

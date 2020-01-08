package KKropa.Lab_5;

import java.util.Scanner;

public class Lab_5_A1 {
    public static void main (String [] args){
        int max=0;
        int min= 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of lines: ");
        int quantitystr = scanner.nextInt();
        String [] array = new String [quantitystr];
        for (int i=0; i<quantitystr; i++){
            System.out.print("Enter line № " + (i+1) + ": ");
            Scanner scanner1 = new Scanner(System.in);
            array[i]=scanner1.nextLine();
            if (array[i].length()<=min){
                min=i;
            }else if (array[i].length()>=max){
                max=i;
            }

        }System.out.println("Line number "+ (min+1) + ": " +  array[min] + " is the smallest. Its length: " +array[min].length());
        System.out.println( "Line number "+ (max+1) + ": " + array [max] + " is the longest. Its length: " +array[max].length());
    }
}

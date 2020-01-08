package KKropa.Lab_5;

import java.util.Scanner;

public class Lab_5_A2 {
    public static void main (String [] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of lines: ");
        int quantitystr = scanner.nextInt();
        String[] array = new String[quantitystr];
        for (int i = 0; i < quantitystr; i++) {
            System.out.print("Enter line № " + (i + 1) + ": ");
            Scanner scanner1 = new Scanner(System.in);
            array[i] = scanner1.nextLine();
        }
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (array[j].length()>array[i].length()){
                    String minmax = array [j];
                    array [j] = array [i];
                    array [i]= minmax;
                }


            }
        }
        System.out.println("Lines are displayed in order of growth: ");
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);

        }
    }
}

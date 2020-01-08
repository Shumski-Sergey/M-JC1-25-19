package KKropa.Lab_5;

import java.util.Scanner;

public class Lab_5_A3 {
    public static void main(String[] args) {

        int sum = 0;
        int middle = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of lines: ");
        int quantitystr = scanner.nextInt();
        String[] array = new String[quantitystr];

        for (int i = 0; i < quantitystr; i++) {
            System.out.print("Enter line № " + (i + 1) + ": ");
            Scanner scanner1 = new Scanner(System.in);
            array[i] = scanner1.nextLine();
            sum += array[i].length(); //вычисляем сумму строк

        }

        middle = sum / quantitystr;
        for (int i = 0; i<quantitystr; i++){
            if (array[i].length()<middle){
                System.out.println("Lines length: " + array[i] +  ", is the smallest than middle length.");
                System.out.println("Its length: " + array[i].length());
            }

        }

    }
}


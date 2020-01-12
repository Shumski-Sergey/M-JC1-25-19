package KKropa.Lab_5;
//4. Ввести n слов с консоли.
// Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Lab_5_A4 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of lines: ");
        int quantitystr = scanner.nextInt();
        String[] array = new String[quantitystr];

        for (int i = 0; i < quantitystr; i++) {
            System.out.print("Enter line № " + (i + 1) + ": ");
            Scanner scanner1 = new Scanner(System.in);
            array[i]=scanner1.nextLine();

        }
        int min = 0;

        for (int i = 0; i<array.length; i++){

            if (array[i].length()<array[min].length()){
                min = i;
            }

        }
        System.out.println("Minimal string is: " + (min+1));

    }
}

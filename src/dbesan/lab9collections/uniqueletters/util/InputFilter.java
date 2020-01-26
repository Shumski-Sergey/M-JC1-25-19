package dbesan.lab9collections.uniqueletters.util;

import java.util.Scanner;

import static dbesan.lab9collections.uniqueletters.util.Constants.CHOICECOUNT;

public class InputFilter {
    private static int choice = 0;

    public static int OnlyDigitsLessChoiseCount() {
        Scanner ChoiseScanner = new Scanner(System.in);
          if (ChoiseScanner.hasNextInt() && ChoiseScanner.nextInt() <= CHOICECOUNT) {
            choice = ChoiseScanner.nextInt();
        } else {
            System.out.println("Введите число, которое меньше, либо равно" + " " + CHOICECOUNT + ".");
            InputFilter.OnlyDigitsLessChoiseCount();
        }
        return choice;
    }
}

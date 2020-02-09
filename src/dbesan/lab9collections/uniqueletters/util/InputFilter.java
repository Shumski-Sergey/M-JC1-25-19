package dbesan.lab9collections.uniqueletters.util;

import java.util.Scanner;

import static dbesan.lab9collections.uniqueletters.util.Constants.CHOICECOUNT;

public class InputFilter {
    private static int choice = 0;

    public static int OnlyDigitsLessChoiseCount() {
        Scanner ChoiseScanner = new Scanner(System.in);
        if (ChoiseScanner.hasNextInt()) {
            int temp = ChoiseScanner.nextInt();
            /** is filtering >0, <CHOICECOUNT, not a letter or word, restart if wrong input
             * maybe not fully right, but its work**/
            if (temp > 0 && temp <= CHOICECOUNT) {
                choice = temp;
            } else {
                System.out.println("Введите число, которое меньше, либо равно" + " " + CHOICECOUNT + " " + "и больше 0.");
                OnlyDigitsLessChoiseCount();
            }
        } else {
            System.out.println("Введите число, которое меньше, либо равно" + " " + CHOICECOUNT + " " + "и больше 0.");
            OnlyDigitsLessChoiseCount();
        }
        return choice;
    }
}

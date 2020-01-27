package dbesan.lab9collections.uniqueletters.util;

import java.util.Scanner;

import static dbesan.lab9collections.uniqueletters.util.Constants.*;


public class InputText {
    private static String text;
    private static int choice;

    public static int getChoice() {
        return choice;
    }

    public static String getText() {
        return text;
    }


    public static void TextAndChoice() {
        System.out.println("Что вы хотите посчитать? Введите номер пункта"
                + "\n" + ONECHOICE + "." + " Все символы"
                + "\n" + SECONDCHOICE + ". " + "Только цифры"
                + "\n" + THIRDCHOICE + ". " + "Все буквы"
                + "\n" + FOURCHOICE + ". " + "Буквы в верхнем регистре"
                + "\n" + FIVECHOICE + ". " + "Буквы в нижнем регистре"
                + "\n" + "________________");
        choice = InputFilter.OnlyDigitsLessChoiseCount();
        /**filtering class choise: is digit, choice > 0,
         and correct with number of counting variants
         restart if wrong input**/
        System.out.println("Введите текст");
        Scanner TextScanner = new Scanner(System.in);/** text to counting**/
        text = TextScanner.nextLine();

    }

}

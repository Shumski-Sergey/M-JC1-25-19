package dbesan.firstcontrol.util;

import java.util.Scanner;

import static dbesan.firstcontrol.util.Constants.*;
import static dbesan.firstcontrol.util.InputFilter.OnlyDigitsLessChoiseCount;


public class InputText {
    private static String text;
    private static int choice;

    public static int getChoice() {
        return choice;
    }

    public static String getText() {
        return text;
    }

    public static void Choice() {
        System.out.println("Введите номер задачи"
                + "\n" + ONECHOICE + ". " + "Найти количество цифр в веденной строке"
                + "\n" + SECONDCHOICE + ". " + "Заменить каждый элемент списка с четным номером на соседний слева элемент."
                + "\n" + THIRDCHOICE + ". " + "Создание списка строк и поиск самой длинной"
                + "\n" + "________________");
        choice = OnlyDigitsLessChoiseCount();
        /**filtering class choise: is digit, choice > 0,
         and correct with number of counting variants
         restart if wrong input**/}

    public static String Text() {
        System.out.println("Введите текст");
        Scanner TextScanner = new Scanner(System.in);/** text to counting**/
        text = TextScanner.nextLine();
        return text;
    }
}



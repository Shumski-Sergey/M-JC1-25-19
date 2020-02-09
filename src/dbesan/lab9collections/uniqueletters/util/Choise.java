package dbesan.lab9collections.uniqueletters.util;


import dbesan.lab9collections.uniqueletters.service.UniqueChars;

import static dbesan.lab9collections.uniqueletters.util.Constants.*;
import static dbesan.lab9collections.uniqueletters.util.InputText.getChoice;
import static dbesan.lab9collections.uniqueletters.util.InputText.getText;

/**
 * Im want to do id with "constructor": with HashMap with names of classes and one constructor
 * in which will be pasted values by keys.
 * For example:
 * value value = new value();
 * value.setText(getText());
 * value.calculate();
 * System.out.print(value.toString());
 * *value* - variable which contains name of right class.
 */

public class Choise {
    public static void maker() {
        UniqueChars UniqueChars = new UniqueChars();
        UniqueChars.setText(getText());
        switch (getChoice()) {
            case ONECHOICE:
                UniqueChars.calculateUniqueChars();
                break;
            case SECONDCHOICE:
                UniqueChars.calculateUniqueDigits();
                break;
            case THIRDCHOICE:
                UniqueChars.calculateUniqueLetters();
                break;
            case FOURCHOICE:
                UniqueChars.calculateUniqueUpperCase();
                break;
            case FIVECHOICE:
                UniqueChars.calculateUniqueLowerCase();
                break;
        }
        System.out.print(UniqueChars.toString());
    }
}

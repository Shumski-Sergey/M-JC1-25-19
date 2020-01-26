package dbesan.lab9collections.uniqueletters.util;


import dbesan.lab9collections.uniqueletters.service.*;

import static dbesan.lab9collections.uniqueletters.util.Constants.*;
import static dbesan.lab9collections.uniqueletters.util.InputText.getChoice;
import static dbesan.lab9collections.uniqueletters.util.InputText.getText;

public class Choise {
    public static void maker() {
        if (ONECHOICE == getChoice()) {
            UniqueChars UniqueChars = new UniqueChars();
            UniqueChars.setText(getText());
            UniqueChars.calculate();
            System.out.print(UniqueChars.toString());
        } else if (getChoice() == SECONDCHOICE) {
            UniqueDigits UniqueDigits = new UniqueDigits();
            UniqueDigits.setText(getText());
            UniqueDigits.calculate();
            System.out.print(UniqueDigits.toString());
        } else if (getChoice() == THIRDCHOICE) {
            UniqueLetters UniqueLetters = new UniqueLetters();
            UniqueLetters.setText(getText());
            UniqueLetters.calculate();
            System.out.print(UniqueLetters.toString());
        } else if (getChoice() == FOURCHOICE) {
            UniqueUpperCase UniqueUpperCase = new UniqueUpperCase();
            UniqueUpperCase.setText(getText());
            UniqueUpperCase.calculate();
            System.out.print(UniqueUpperCase.toString());

        } else if (getChoice() == FIVECHOICE) {
            UniqueLowerCase UniqueLowerCase = new UniqueLowerCase();
            UniqueLowerCase.setText(getText());
            UniqueLowerCase.calculate();
            System.out.print(UniqueLowerCase.toString());
        }
    }
}

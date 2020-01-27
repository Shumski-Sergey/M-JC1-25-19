package dbesan.lab9collections.uniqueletters.util;


import dbesan.lab9collections.uniqueletters.service.*;

import static dbesan.lab9collections.uniqueletters.util.Constants.*;
import static dbesan.lab9collections.uniqueletters.util.InputText.getChoice;
import static dbesan.lab9collections.uniqueletters.util.InputText.getText;
/**Im want to do id with "constructor": with HashMap with names of classes and one constructor
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
        if (ONECHOICE == getChoice()) { /**compare with choise**/
            UniqueChars UniqueChars = new UniqueChars(); /**creating object to work**/
            UniqueChars.setText(getText()); /**get text**/
            UniqueChars.calculate();/**calculating letter quantity**/
            System.out.print(UniqueChars.toString()); /**output. Lower the same*/
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

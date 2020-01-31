package dbesan.firstcontrol.util;


import dbesan.firstcontrol.services.ChangingElement;
import dbesan.firstcontrol.services.LongString;
import dbesan.firstcontrol.services.UniqueChars;

import static dbesan.firstcontrol.util.Constants.*;
import static dbesan.firstcontrol.util.InputText.getChoice;
import static dbesan.firstcontrol.util.InputText.getText;


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
        switch (getChoice()) {
            case ONECHOICE:
                UniqueChars UniqueChars = new UniqueChars();
                UniqueChars.setText(getText());
                UniqueChars.calculateUniqueDigits();
                System.out.print(UniqueChars.toString());
                break;
            case SECONDCHOICE:
                ChangingElement ChangingElement = new ChangingElement();
                ChangingElement.toLeft();
                System.out.print(ChangingElement.toString());
                break;
            case THIRDCHOICE:
                LongString LongString = new LongString();
                LongString.longest();
                System.out.print(LongString.toString());
                break;
        }
    }
}

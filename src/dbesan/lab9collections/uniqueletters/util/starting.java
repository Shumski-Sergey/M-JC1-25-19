package dbesan.lab9collections.uniqueletters.util;

import java.io.IOException;

import static dbesan.lab9collections.uniqueletters.util.Choise.maker;
import static dbesan.lab9collections.uniqueletters.util.InputText.TextAndChoice;
import static dbesan.lab9collections.uniqueletters.util.StayOnRun.ToBeOnline;

public class starting {
    public static void start() throws IOException {
        TextAndChoice(); /**main menu, input number of counting variant and text input**/
        maker(); /**variants of counting and counting**/
        ToBeOnline();/**it is need to cycled run**/
    }
}

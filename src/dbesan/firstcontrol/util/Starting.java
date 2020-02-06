package dbesan.firstcontrol.util;

import java.io.IOException;

import static dbesan.firstcontrol.util.Choise.maker;
import static dbesan.firstcontrol.util.InputText.Choice;
import static dbesan.firstcontrol.util.StayOnRun.ToBeOnline;


public class Starting {
    public static void start() throws IOException {
        Choice(); /**main menu, input number of counting variant and text input**/
        maker(); /**variants of counting and counting**/
        ToBeOnline();/**it is need to cycled run**/
    }
}

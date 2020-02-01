package dbesan.firstcontrol.util;

import java.io.IOException;
import java.util.Scanner;

import static dbesan.firstcontrol.util.Constants.BACKCHOICE;
import static dbesan.firstcontrol.util.Constants.EXITCHOICE;
import static dbesan.firstcontrol.util.starting.start;


public class StayOnRun {
    public static void ToBeOnline() throws IOException {
        System.out.println("Введите 0 для возврата" + "\n" + "Введите EXIT для выхода");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() == BACKCHOICE) {
                start();
            } else {
                ToBeOnline();
            }
        }
        if (scanner.nextLine().equals(EXITCHOICE)) {
        } else {
            ToBeOnline();
        }
    }
}

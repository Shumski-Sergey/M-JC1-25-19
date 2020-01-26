package dbesan.lab9collections.uniqueletters.util;

import java.io.IOException;
import java.util.Scanner;

import static dbesan.lab9collections.uniqueletters.util.Constants.BACKCHOICE;
import static dbesan.lab9collections.uniqueletters.util.Constants.EXITCHOICE;

public class StayOnRun {
    public static void ToBeOnline() throws IOException {
        System.out.println("Введите 0 для возврата" + "\n" + "Введите EXIT для выхода");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() == BACKCHOICE) {
                starting.start();
            } else {
                StayOnRun.ToBeOnline();
            }
        }
        if (scanner.nextLine().equals(EXITCHOICE)) {
        } else {
            StayOnRun.ToBeOnline();
        }
    }
}

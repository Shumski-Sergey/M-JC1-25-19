package dbesan.lab6.b2.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.valueOf;

public class InputCop {
    public static int InputCop() throws IOException {
        System.out.println("Введите копейки");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        char pennyz = (char) Integer.parseInt(reader1.readLine());
        int penny = valueOf(pennyz);
        return penny;
    }
}
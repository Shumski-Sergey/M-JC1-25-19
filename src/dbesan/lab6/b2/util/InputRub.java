package dbesan.lab6.b2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputRub {
    public static long InputRub() throws IOException {
        System.out.println("Введите рубли");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long rubles = Integer.parseInt(reader.readLine());
        return rubles;
    }
}

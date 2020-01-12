package tmurashka.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int n = Integer.parseInt(reader.readLine());
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Line № " + (i + 1) + ": ");
            strArray[i] = reader.readLine();
        }
        float a = 0;
        for (int i = 0; i < n; i++) {
            a += strArray[i].length();
        }
        a /= n;
        for (int i = 0; i < n; i++) {
            if (strArray[i].length() < a) {
                System.out.println(strArray[i]);
            }
        }
    }
}

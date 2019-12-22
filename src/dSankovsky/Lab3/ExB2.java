package dSankovsky.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb;
        do {
            System.out.println("Введите натуральное число");
            String first = reader.readLine();
            numb = Integer.parseInt(first);
        } while (numb <= 0);
        System.out.print("Делители числа " + numb + ": ");
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0)
                System.out.print(" " + i);
        }
    }
}

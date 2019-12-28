package dSankovsky.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExB1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb;
        do {
            System.out.println("Введите натуральное число");
            String first = reader.readLine();
            numb = Integer.parseInt(first);
        } while (numb <= 0);
        int fact = 1;
        for (int i = 1; i <= numb; i++) {   //расчет факториала
            fact *= i;
        }
        System.out.println("Факториал числа " + numb + " равен " + fact);
    }
}

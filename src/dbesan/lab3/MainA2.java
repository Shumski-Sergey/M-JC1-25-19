package dbesan.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainA2 {
    public static void main(String[] args) throws IOException {
        System.out.println("ПРограмма вычисляет, является ли число простым");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine()); //читаем троку
        if ((a % 2 == 0) || (a % 3 == 0) || (a % 4 == 0) || (a % 5 == 0) || (a % 6 == 0) || (a % 7 == 0) || (a % 8 == 0) || (a % 9 == 0)) //число должно делиться на 1 и на себя, а значит запрещаем все остальное
        {
            System.out.println("Не простое");
        } else {
            System.out.println("Простое");
        }
    }
}

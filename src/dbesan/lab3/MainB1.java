package dbesan.lab3;

import java.io.*;

public class MainB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Считаем факториал. Введите число");
        int a = Integer.parseInt(reader.readLine()); //читаем строку и сразу парсим в число
        int x = 1; //результат
        for (int i = 1; i <= a; i++) {
            x = x * i; //вычисляем факториал
        }
        System.out.print("Фрактал числа" + a + " составляет " + x);


    }
}

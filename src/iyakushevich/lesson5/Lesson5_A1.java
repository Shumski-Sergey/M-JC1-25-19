package iyakushevich.lesson5;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5_A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(reader.readLine());

        String[] strings = new String[num];
        int[] size = new int[num];

        //запись строк в массив и вычисление их длины
        for (int i = 0; i < num; i++) {
            System.out.print("Введите строку " + i + ": ");
            strings[i] = reader.readLine(); //массив строк
            size[i] = strings[i].length(); //массив длины
            //System.out.println("Длина строки: " + length[i]);
        }

        //поиск самой короткой и самой длинной строк
        int min = size[0], max = size[0];
        for (int value : size) {
            if (min > value) min = value;
            if (max < value) max = value;
        }

        //вывод в консоль
        System.out.println("Самая короткая строка: ");
        for (int i = 0; i < num; i++) {
            if (size[i] == min) System.out.print(i + ": " + strings[i] + '\n');
        }

        System.out.println("Самая длинная строка: ");
        for (int i = 0; i < num; i++) {
            if (size[i] == max) System.out.print(i + ": " + strings[i] + '\n');
        }
    }
}

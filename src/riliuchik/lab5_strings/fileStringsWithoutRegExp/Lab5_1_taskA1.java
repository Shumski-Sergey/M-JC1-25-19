package src.riliuchik.lab5_strings.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.

public class Lab5_1_taskA1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(in.readLine());
        String[] str = new String[num];
        int[] size = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.readLine();
            size[i] = str[i].length();
        }
        int min = size[0];
        int max = size[0];
        for (int i = 1; i < num; i++) {
            if (size[i] < min) min = size[i];
            if (size[i] > max) max = size[i];
        }
        System.out.println("Самые короткие строки длиной " + min + ":");
        for (int i = 0; i < num; i++)
            if (size[i] == min)
                System.out.println("№" + (i + 1) + ": " + str[i]);
        System.out.println("Самые длинные строки длиной " + max + ":");
        for (int i = 0; i < num; i++)
            if (size[i] == max)
                System.out.println("№" + (i + 1) + ": " + str[i]);
    }
}
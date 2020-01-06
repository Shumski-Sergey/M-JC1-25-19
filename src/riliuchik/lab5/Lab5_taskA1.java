package riliuchik.lab5;

import java.util.Scanner;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//Вывести найденные строки и их длину.

public class Lab5_taskA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int num = in.nextInt();
        String[] str = new String[num];
        int[] size = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.next();
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
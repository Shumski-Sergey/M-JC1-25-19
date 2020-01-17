package riliuchik.lab5.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n строк с консоли. Вывести на консоль те строки,
//длина которых меньше (больше) средней, а также длину.

public class Lab5_1_taskA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(in.readLine());
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.readLine();
        }
        float average = 0f;
        for (int i = 0; i < num; i++) {
            average += str[i].length();
        }
        average = Math.round(average / num);
        int newAverage = (int) average;
        System.out.println("Строки, которые меньше средней строки (длиной " + newAverage + "):");
        for (int i = 0; i < num; i++) {
            if (str[i].length() < average)
                System.out.println("№" + (i + 1) + " длиной " + str[i].length() + ": " + str[i]);
        }
        System.out.println("Строки, которые больше средней строки (длиной " + newAverage + "):");
        for (int i = 0; i < num; i++) {
            if (str[i].length() > average)
                System.out.println("№" + (i + 1) + " длиной " + str[i].length() + ": " + str[i]);
        }
    }
}
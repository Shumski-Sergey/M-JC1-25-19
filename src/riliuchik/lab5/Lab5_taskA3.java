package riliuchik.lab5;

import java.util.Scanner;

//Ввести n строк с консоли. Вывести на консоль те строки,
//длина которых меньше (больше) средней, а также длину.

public class Lab5_taskA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int num = in.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.next();
        }
        float average = 0f;
        for (int i = 0; i < num; i++) {
            average += str[i].length();
        }
        average /= num;
        System.out.println("Строки, которые меньше средней длины " + average + ":");
        for (int i = 0; i < num; i++) {
            if (str[i].length() < average)
                System.out.println("№" + (i + 1) + " длиной " + str[i].length() + ": " + str[i]);
        }
        System.out.println("Строки, которые больше средней длины " + average + ":");
        for (int i = 0; i < num; i++) {
            if (str[i].length() > average)
                System.out.println("№" + (i + 1) + " длиной " + str[i].length() + ": " + str[i]);
        }
    }
}
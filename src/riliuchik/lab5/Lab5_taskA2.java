package riliuchik.lab5;

import java.util.Scanner;

//Ввести n строк с консоли. Упорядочить и вывести строки
//в порядке возрастания (убывания) значений их длины.

public class Lab5_taskA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int num = in.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.next();
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String next = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = next;
                }
            }
        }
        System.out.println("Строки в порядке возрастания значений их длины:");
        for (int i = 0; i < num; i++) System.out.println(str[i]);

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() < str[j + 1].length()) {
                    String next = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = next;
                }
            }
        }
        System.out.println("Строки в порядке убывания значений их длины:");
        for (int i = 0; i < num; i++) System.out.println(str[i]);
    }
}
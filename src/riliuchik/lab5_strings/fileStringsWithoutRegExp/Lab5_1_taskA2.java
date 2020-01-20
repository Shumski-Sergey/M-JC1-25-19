package src.riliuchik.lab5_strings.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n строк с консоли. Упорядочить и вывести строки
//в порядке возрастания (убывания) значений их длины.

public class Lab5_1_taskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(in.readLine());
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            str[i] = in.readLine();
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
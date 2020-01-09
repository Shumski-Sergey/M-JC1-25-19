package riliuchik.lab5.fileStringsWithoutRegExp;

//Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
//Если таких слов несколько, найти первое из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_taskA6 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.readLine();
        }
        boolean growth = true;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < words[i].length() - 1; j++) {
                if ((words[i].charAt(j) + 1) == (int) words[i].charAt(j + 1)) growth = true;
                else {
                    growth = false;
                    break;
                }
            }
            if (growth) {
                System.out.println("Слово, в котором символы идут в строгом порядке возрастания их кодов: " + words[i]);
                break;
            }
        }
        if (!growth) {
            System.out.println("Нет слов, в которых символы идут в строгом порядке возрастания их кодов");
        }
    }
}
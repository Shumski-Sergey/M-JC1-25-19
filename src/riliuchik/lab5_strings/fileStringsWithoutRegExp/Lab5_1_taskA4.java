package riliuchik.lab5_strings.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//Если таких слов несколько, найти первое из них.

public class Lab5_1_taskA4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.readLine();
        }
        int[] count = new int[num];
        for (int i = 0; i < num; i++) {
            StringBuilder unStr = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                String sign = String.valueOf(words[i].charAt(j));
                if (unStr.indexOf(sign) == -1) unStr.append(sign); //т.е. если не встречался символ
            }
            int unStrLength = unStr.length();
            count[i] = unStrLength;
        }
        int k = 1;
        for (int i = 0; i < num; i++) {
            if (count[i] > k) k++;
        }
        if (k == 1) {
            System.out.print("Нет слов с различным символами");
            return;
        }
        String result = words[0];
        int index = 0;
        int finalLength = count[index];
        for (int i = 0; i < num; i++) {
            if (count[i] > 1) {
                result = words[i];
                index = i;
                finalLength = count[i];
                break;
            }
        }
        for (int i = 0; i < num; i++) {
            if (count[i] > 1 && count[i] < finalLength) {
                result = words[i];
                index = i;
                finalLength = count[i];
            }
        }
        for (int i = 0; i < num; i++) {
            if (count[i] > 1 && count[i] == finalLength) break;
        }
        System.out.print("Первое из слов, которое имеет минимальное число различых символов (" + finalLength + ") под №" + (index + 1) + ": " + result);
    }
}
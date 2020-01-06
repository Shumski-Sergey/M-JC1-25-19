package riliuchik.lab5;

import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//Если таких слов несколько, найти первое из них.

public class Lab5_taskA4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int num = in.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.next();
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
        String result = words[0];
        int index = 0;
        int finalLength = count[index];
        int n = 0;
        for (int i = 1; i < num; i++) {
            if (n > 1) break;
            if (count[i] < finalLength) {
                result = words[i];
                index = i;
                finalLength = count[i];
                n++;
            }
        }
        System.out.print("Первое из слов, которое имеет минимальное число различых символов (" + finalLength + ") под №" + (index + 1) + ": " + result);
    }
}
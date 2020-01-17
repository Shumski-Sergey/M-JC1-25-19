package riliuchik.lab5_strings.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
//а среди них – количество слов с равным числом гласных и согласных букв.

public class Lab5_1_taskA5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        boolean latin = true;
        int n = 0;
        int equals = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.readLine();
            for (int j = 0; j < words[i].length(); j++) {
                if ((words[i].charAt(j) >= '\u0061' && words[i].charAt(j) <= '\u007A') ||
                        (words[i].charAt(j) >= '\u0041' && words[i].charAt(j) <= '\u005A')) latin = true;
                else {
                    latin = false;
                    break;
                }
            }
            if (latin) {
                n++;
                int vowels = 0;
                int consonants = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'A' ||
                            words[i].charAt(j) == 'e' || words[i].charAt(j) == 'E' ||
                            words[i].charAt(j) == 'i' || words[i].charAt(j) == 'I' ||
                            words[i].charAt(j) == 'o' || words[i].charAt(j) == 'O' ||
                            words[i].charAt(j) == 'u' || words[i].charAt(j) == 'U') vowels++;
                    else consonants++;
                }
                if (vowels == consonants) equals++;
            }
        }
        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + n);
        System.out.println("Среди них количество слов с равным числом гласных и согласных букв: " + equals);
    }
}
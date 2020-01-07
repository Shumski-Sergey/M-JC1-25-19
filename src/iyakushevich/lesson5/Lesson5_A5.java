package iyakushevich.lesson5;

//5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
//   а среди них – количество слов с равным числом гласных и согласных букв.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5_A5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(reader.readLine());

        String[] word = new String[num];

        //запись строк в массив и вычисление их длины
        for (int i = 0; i < num; i++) {
            System.out.print("Введите строку " + i + ": ");
            word[i] = reader.readLine(); //массив строк
        }

        //поиск слов, содержащих только латинские буква
        System.out.println('\n' + "Слова, содержащие только буквы латинского алфавита: ");
        boolean latin = true;
        int count = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                if ((word[i].charAt(j) >= '\u0041' && word[i].charAt(j) <= '\u005A') ||
                        (word[i].charAt(j) >= '\u0061' && word[i].charAt(j) <= '\u007a')) latin = true;
                else {
                    latin = false;
                    break;
                }
            }
            if (latin) {
                System.out.print(word[i]);
                //проверка количества гласных и согласных
                int vowel = 0;
                for (int j = 0; j < word[i].length(); j++) {
                    for (char c : vowels) {
                        if (word[i].charAt(j) == c) {
                            vowel++;
                            break;
                        }
                    }
                }
                if (word[i].length() - vowel == vowel)
                    System.out.print(" -  этом слове количество гласных и согласных одинаково.");
                count++;
                System.out.println();
            }
        }
        System.out.print('\n' + "Количесиво слов, содержащих только латинские буквы: " + count);
    }
}

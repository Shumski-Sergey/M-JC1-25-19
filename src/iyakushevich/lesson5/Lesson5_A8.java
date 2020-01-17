package iyakushevich.lesson5;

//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
//   Если таких слов больше одного, найти второе из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson5_A8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(reader.readLine());

        String[] word = new String[num];

        //запись строк в массив
        for (int i = 0; i < num; i++) {
            System.out.print("Введите слово " + i + ": ");
            word[i] = reader.readLine(); //массив строк
        }

        ArrayList<String> wordList = new ArrayList<>();
        boolean isPalindrome = true;
        for (String s : word) {                                     //перебираем все слова из массива
            if (s.matches(".*[^0-9]+.*")) continue;           //пропускаем слово, если оно не содержит цифры
            for (int j = 0; j < s.length() / 2; j++) {              //доходим до середины слова
                if (s.charAt(j) == s.charAt(s.length() - 1 - j)) {  //сравниваем первую и последнюю буквы
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) wordList.add(s);
        }

        if (wordList.size() > 1) System.out.println("Второе по счету слово-палиндром из цифр: " + wordList.get(1));
        else if (wordList.size() == 0) System.out.println("Слов-палиндромов из цифр нет.");
        else System.out.println("Первое по счету слово-палиндром из цифр: " + wordList.get(0));
    }
}

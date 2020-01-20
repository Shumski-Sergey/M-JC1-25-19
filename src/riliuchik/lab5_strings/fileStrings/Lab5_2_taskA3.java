package src.riliuchik.lab5_strings.fileStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Имеется строка с текстом. Вывести текст,
//составленный из последних букв всех слов.

public class Lab5_2_taskA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с текстом:");
        String str = in.readLine();
        str = str.replaceAll("[^А-яЁёA-z ]", "");
        String[] words = str.split(" ");
        StringBuilder last = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) last.append(word.charAt(word.length() - 1));
        }
        System.out.print("Текст, составленный из последних букв всех слов:\n" + last);
    }
}
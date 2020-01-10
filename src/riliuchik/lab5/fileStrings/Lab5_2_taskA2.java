package riliuchik.lab5.fileStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Имеется строка с текстом. Подсчитать количество слов в тексте.
//Желательно учесть, что слова могут разделяться несколькими пробелами,
//в начале и конце текста также могут быть пробелы, но могут и отсутствовать.

public class Lab5_2_taskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с текстом:");
        String str = in.readLine();
        Pattern p = Pattern.compile("[А-яЁёA-z]+");
        Matcher matcher = p.matcher(str);
        int num = 0;
        while (matcher.find()) {
            num++;
        }
        System.out.print("Количество слов в введенном тексте: " + num);
    }
}
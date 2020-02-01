package dmitrypolyakov.TaskLines;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 27.01.2020
 *
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

import java.io.IOError;
import java.io.IOException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loops2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение(ния) со знааками препинания одной строкой");
        String text = sc.nextLine();
        Pattern p = Pattern.compile("[А-яA-z0-9]+");
        Matcher matcher = p.matcher(text);
        int num = 0;
        while (matcher.find()) {
            num++;
        }
        System.out.println("В тексте: " + num + " слова(ов)");
    }
}

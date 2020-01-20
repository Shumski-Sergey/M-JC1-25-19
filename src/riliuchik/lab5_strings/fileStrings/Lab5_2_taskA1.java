package riliuchik.lab5_strings.fileStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Найти в строке не только запятые, но и другие знаки препинания.
//Подсчитать общее их количество.

public class Lab5_2_taskA1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку c текстом:");
        String str = in.readLine();
        Pattern p = Pattern.compile("\\.{3}|[.,?!:;)\"(\\-]");
        Matcher matcher = p.matcher(str);
        int num = 0;
        while (matcher.find()) {
            num++;
        }
        System.out.print("Количество знаков препинания в введенном тексте: " + num);
    }
}
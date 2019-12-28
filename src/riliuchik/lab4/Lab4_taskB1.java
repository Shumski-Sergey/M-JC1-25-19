package src.riliuchik.lab4;

import java.util.Scanner;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.

public class Lab4_taskB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите произвольный текст для поиска в нем знаков препинания:");
        String str = in.nextLine();
        int i;
        char mark;
        int n = 0;
        for (i = 0; i < str.length(); i++) {
            mark = str.charAt(i);
            if (mark == ' ' || mark == '.' || mark == ',' || mark == '?' || mark == '!'
                    || mark == '"' || mark == '-' || mark == ':' || mark == ';') {
                n++;
            }
        }
        System.out.print("Количество знаков препинания в введенном тексте: " + n);
    }
}
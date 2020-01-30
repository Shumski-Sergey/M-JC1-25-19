package dmitrypolyakov.TaskLines;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 24.01.2020
 *
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
 */

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение(ния) со знааками препинания одной строкой");
        String text = sc.nextLine();
        int before = text.length();
        int after = text.replaceAll("[,.!?:;-]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
    }
}
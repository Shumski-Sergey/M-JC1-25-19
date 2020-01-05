package aantonovich.Lesson5;//Ввести n строк с консоли,
// найти самую короткую и самую длинную строки. Вывести найденные строки и их длину

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] text ;
        Scanner s = new Scanner(System.in);
        int indexmax = 0;              // номер самой длинной строки в массиве text
        int indexmin = 0;             // номер самой короткой строки в массиве text
        int n;                       // кол-во строк, вводимых с клавиатуры
        System.out.println("Введите кол-во строк:");
        n = Integer.parseInt(s.nextLine());
            text = new String[n]; // массив строк
            System.out.println("Введите строки :");
            for (int i = 0; i < n; i++) { // перебор массива и нахождение индекса max и min строк
                text[i] = s.nextLine();
                if (text[i].length() >= text[indexmax].length())
                    indexmax = i;
                if (text[i].length() <= text[indexmin].length())
                    indexmin = i;
        }
            System.out.println("Самая длинная строка(последняя для одинаково длинных): " + text[indexmax]);
            System.out.println("Длина строки: " + text[indexmax].length() + " символов");
            System.out.println("Самая короткая строка(последняя для одинаково коротких): " + text[indexmin]);
            System.out.println("Длина строки: " + text[indexmin].length() + " символов");
        }
}
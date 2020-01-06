package aantonovich.Lesson5;// Ввести n строк с консоли.
// Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String[] text ;
        int n;
        System.out.println("Введите кол-во строк:");
        n = Integer.parseInt(s.nextLine());
        text = new String[n]; // массив строк
        System.out.println("Введите строки :");
        for (int i = 0; i < n; i++) {
            text[i] = s.nextLine();
           }
        for (int i = text.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (text[j].length() > text[j+1].length()) {
                    String tmp = text[j];
                    text[j] = text[j+1];
                    text[j+1] = tmp;
                }
            }
        }
        System.out.println("Строки в порядке возрастания: ");
        for (String value : text) {  // (int i = 0; i < text.length; i++) IDEA поменяла
            System.out.println(value);
        }
    }
}
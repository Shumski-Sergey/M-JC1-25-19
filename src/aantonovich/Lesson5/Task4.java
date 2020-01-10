package aantonovich.Lesson5;// Ввести n слов с консоли. Найти слово, в котором число
// различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите слова через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        int indexWord = 0;
        int count = 0;
        int etalonCount = 1;
        for (int i = 0; i < words.length; i++) {
            char[] letter = new char[words[i].length()];
            for (int j = 0; j < letter.length; j++) {
                letter[j] = words[i].charAt(j);
            }
            for (int j = 0; j < letter.length; j++) {
                for (int k = j + 1; k < letter.length; k++) {
                    if (letter[j] == letter[k]) {
                        break;
                    } else { count++; }
                }
                if (etalonCount > count)
                    indexWord = i;
                etalonCount = count;
            }
            count = 0;
        }
        System.out.println("Слово с минимальным количеством различных символов(последнее из списка): "+ words[indexWord]);
    }
}
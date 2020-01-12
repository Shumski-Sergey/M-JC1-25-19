package aantonovich.Lesson5;//Ввести n слов с консоли. Найти количество слов,
// содержащих только символы латинского алфавита, а среди них – количество слов
// с равным числом гласных и согласных букв.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Task5 {
    public static void main(String[] args) {
        int n;
        int equalNumber = 0;
        int countWord = 0;
        int countVowel = 0;
        int countConsonant = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        n = parseInt(scanner.nextLine());
        String [] text = new String[n];
        System.out.println("Введите слова: ");
        for (int i = 0; i < n; i++) {
            text[i] = scanner.nextLine();
        }
        Pattern pattern = Pattern.compile("[a-z,A-Z]*");
        for (int j = 0; j < text.length; j++) {
            Matcher matcher = pattern.matcher(text[j]);
            if (matcher.matches()) {
                countWord++;
                String words = text[j];
                Pattern pattern1 = Pattern.compile("[EYUIOAeyuioa]");
                for (int k = 0; k < words.length(); k++) {
                    String w = Character.toString(words.charAt(k));
                    Matcher matcher1 = pattern1.matcher(w);
                    if (matcher1.find()) {
                        countVowel++;
                    } else countConsonant++;
                }
                if (countConsonant == countVowel) {
                    equalNumber++;
                }
            }
        }
        System.out.println("Найдено " + countWord + " слов, содержащих только символы латинского алфавита");
        System.out.println("Найдено " + equalNumber + " слов с равным числом гласных и согласных букв");
    }
}
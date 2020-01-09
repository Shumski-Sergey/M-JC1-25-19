package riliuchik.lab5.fileStringsWithoutRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
//а среди них – количество слов с равным числом гласных и согласных букв.

public class Lab5_taskA5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        int n = 0;
        int vowels = 0;
        int consonants = 0;
        int equals = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.readLine();
            Pattern p = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = p.matcher(words[i]);
            while (matcher.find()) {
                n++;
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'A') vowels++;
                    else if (words[i].charAt(j) == 'e' || words[i].charAt(j) == 'E') vowels++;
                    else if (words[i].charAt(j) == 'i' || words[i].charAt(j) == 'I') vowels++;
                    else if (words[i].charAt(j) == 'o' || words[i].charAt(j) == 'O') vowels++;
                    else if (words[i].charAt(j) == 'u' || words[i].charAt(j) == 'U') vowels++;
                    else consonants++;
                }
                if (vowels == consonants) equals++;
                vowels = 0;
                consonants = 0;
            }
        }
        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + n);
        System.out.println("Среди них количество слов с равным числом гласных и согласных букв: " + equals);
    }
}
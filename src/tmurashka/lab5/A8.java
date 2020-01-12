package tmurashka.lab5;

// Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");

        int count = 0;
        String palindrom = null;
        for (String word : strArray) {
            if (word.isEmpty()) {
                continue;
            }
            boolean pal = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i) || (word.charAt(i) < '0' || word.charAt(i) > '9' )) {
                    pal = false;
                    break;
                }
            }
            if (pal) {
                count++;
                palindrom = word;
            }
            if (count == 2) {
                break;
            }
        }
        if (palindrom != null) {
            System.out.println(palindrom);
        }
    }
}

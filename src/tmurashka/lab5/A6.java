package tmurashka.lab5;

// Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
// Если таких слов несколько, найти первое из них

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] atrArray = str.split("[.!?, -]");
        for (String word : atrArray) {
            if (word.isEmpty()) {
                continue;
            }
            boolean found = true;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) >= word.charAt(i + 1)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(word);
                break;
            }
        }

    }
}

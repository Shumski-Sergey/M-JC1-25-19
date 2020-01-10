package tmurashka.lab5;

//Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");

        for (String word : strArray) {
            if (word.isEmpty()) {
                continue;
            }
            boolean unique = true;
            for (int j = 0; j < word.length(); j++) {

                for (int k = j + 1; k < word.length(); k++) {
                    if (word.charAt(j) == word.charAt(k)) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
            }
            if (unique) {
                System.out.println(word);
                break;
            }
        }
    }
}

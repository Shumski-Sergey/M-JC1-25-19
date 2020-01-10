package tmurashka.lab5;

// Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
// а среди них – количество слов с равным числом гласных и согласных букв

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");
        int wordCount = 0;
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].isEmpty()) {
                continue;
            }
            int count = 0;
            boolean match = true;
            for (int j = 0; j < strArray[i].length(); j++) {
                if ((strArray[i].charAt(j) >= 'a' && strArray[i].charAt(j) <= 'z')
                     || (strArray[i].charAt(j) >= 'A' && strArray[i].charAt(j) <= 'Z')) {
                    if (vowels.indexOf(strArray[i].charAt(j)) == -1) {
                        count++;
                    }
                    else {
                        count--;
                    }
                }
                else {
                    match = false;
                }
            }
            if (!match) {
                continue;
            }
            if (count == 0) {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}

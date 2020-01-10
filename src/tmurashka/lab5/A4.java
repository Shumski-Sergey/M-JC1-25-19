package tmurashka.lab5;

// Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[.!?, -]");
        int minCount = 2000000000;
        int minIndex = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].isEmpty()) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < strArray[i].length(); j++) {
                boolean unique = true;
                for (int k = j + 1; k < strArray[i].length(); k++) {
                    if (strArray[i].charAt(j) == strArray[i].charAt(k)) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    count++;
                }
            }
            if (minCount > count)
            {
                minCount = count;
                minIndex = i;
            }
        }
        System.out.println(strArray[minIndex] + " " + minCount);
    }
}

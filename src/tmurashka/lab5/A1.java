package tmurashka.lab5;

// Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Line №  " + (i + 1) + ": ");
            str[i] = reader.readLine();
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (str[i].length() < str[minIndex].length()) {
                minIndex = i;
            }
            if (str[i].length() > str[maxIndex].length()) {
                maxIndex = i;
            }
        }
        System.out.println("Shortest line with a length of " + str[minIndex].length() + " characters is: " + str[minIndex]);
        System.out.println("Longest line with a length of " + str[maxIndex].length() + " characters is: " + str[maxIndex]);
    }
}

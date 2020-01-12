package tmurashka.lab5;

// Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Line №  " + (i + 1) + ": ");
            str[i] = reader.readLine();
        }
        for (int i = 0; i < str.length - 1; i++){
            for (int j = 0; j < str.length - 1 - i; j++){
                if (str[j].length() > str[j + 1].length()) {
                    String b = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = b;
                }
            }
        }
        for (String word : str) {
            System.out.println(word);
        }
    }
}

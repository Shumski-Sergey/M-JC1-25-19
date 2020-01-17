package tmurashka.lab5.strings;

// Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
// несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] strArray = str.split("[ .!?,:;]");
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].isEmpty()) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}

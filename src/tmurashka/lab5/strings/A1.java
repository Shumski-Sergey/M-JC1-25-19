package tmurashka.lab5.strings;

// Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Pattern p = Pattern.compile("[.!?,:;]");
        Matcher m = p.matcher(str);
        int n = 0;
        while (m.find()) {
            n++;
        }
        System.out.println(n);

    }
}

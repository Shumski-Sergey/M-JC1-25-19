package dSankovsky.RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//print all words and amount

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line");
        String line = reader.readLine();
        int count = 0;
        Pattern pattern = Pattern.compile("(\\w+)");   //   "\\w+" - one or more letter or number without punct. marks
        Matcher matcher = pattern.matcher(line);
        System.out.println("All words: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println();
        System.out.println("Number of words: " + count);
    }
}

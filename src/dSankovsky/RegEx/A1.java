package dSankovsky.RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//найти знаки препинания и посчитать их количество
public class A1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line");
        String line = reader.readLine();
        Pattern pattern = Pattern.compile("[.,!?]");   //find every single punctuation mark
        Matcher matcher = pattern.matcher(line);
        System.out.print("All punctuation marks: ");
        while (matcher.find()) {   //print one at a time, then next mark
            count++;
            System.out.print(matcher.group());
        }
        System.out.println();
        System.out.println("Number of punctuation marks: " + count);
    }
}

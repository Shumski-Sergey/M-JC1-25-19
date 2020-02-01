package dSankovsky.FirstControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UtilClass for easy life
 *
 * @author Dmitry Sankovsky
 */

public class UtilClass {
    //get line from console and return one String
    public String EnterTheLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line: ");
        return reader.readLine();
    }

    //get amount of lines and add many lines in List
    public List<String> EnterManyLines() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^\\d*$");
        String enteredLine;
        Matcher matcher;
        do {
            System.out.println("Enter amount of lines: ");
            enteredLine = reader.readLine();
            matcher = pattern.matcher(enteredLine);
        } while (!matcher.matches());
        List<String> manyLines = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(enteredLine); i++) {
            manyLines.add(EnterTheLine());
        }
        return manyLines;
    }

    //print all lines from List
    public void PrintAllLines(List<String> manyLines) {
        System.out.println("Your new line, enjoy: ");
        for (String line : manyLines) {
            System.out.print(line + "   ");
        }
    }
}


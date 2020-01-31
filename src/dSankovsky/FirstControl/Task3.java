package dSankovsky.FirstControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * create 5 lines. With cycle find the longest line (or many) and print in console
 *
 * @author Dmitry Sankovsky
 */

//uses method EnterManyLines to get List with Strings
//then send list in method LongestLine, find the longest line (or many lines) and send to print
public class Task3 {
    public static void main(String[] args) throws IOException {
        UtilClass utilClass = new UtilClass();
        List<String> manyLines = utilClass.EnterManyLines();
        utilClass.PrintAllLines(LongestLines(manyLines));
    }

    //uses a loop to find the longest String in List and add it to new List
    public static List<String> LongestLines(List<String> manyLines) {
        List<String> longestLines = new ArrayList<>();
        for (int i = 0; i < manyLines.size(); i++) {
            if (i == 0) {
                longestLines.add(manyLines.get(i));
            } else if (manyLines.get(i).length() == longestLines.get(0).length()) {
                longestLines.add(manyLines.get(i));
            } else if (manyLines.get(i).length() > longestLines.get(0).length()) {
                longestLines.clear();
                longestLines.add(manyLines.get(i));
            }
        }
        return longestLines;
    }
}

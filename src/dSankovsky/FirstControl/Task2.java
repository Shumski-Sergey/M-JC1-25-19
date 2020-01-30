package dSankovsky.FirstControl;

import java.io.IOException;
import java.util.List;

/**
 * swap even element and his left neighbor
 *
 * @author Dmitry Sankovsky
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        UtilClass utilClass = new UtilClass();
        List<String> manyLines = utilClass.EnterManyLines();
        ChangeElementPosition(manyLines);
        utilClass.PrintAllLines(manyLines);
    }

    //swap elements with a loop
    public static void ChangeElementPosition(List<String> manyLines) {
        for (int i = 0; i < manyLines.size(); i++) {
            if (i % 2 == 0 && i != 0) {
                String temp;
                temp = manyLines.get(i);
                manyLines.set(i, manyLines.get(i - 1));
                manyLines.set(i - 1, temp);
            }
        }
    }
}

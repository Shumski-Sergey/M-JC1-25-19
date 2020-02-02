package tmurashka.firstControl.task3;

import tmurashka.firstControl.StringInputReader;
import java.io.IOException;
import java.util.List;

/**
 * Создадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
 * Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
 * Самые длинные строки будут выведены на экран.
 */

public class Task3 {
    private static final int STRING_COUNT = 5;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter 5 strings");
        List<String> strings = StringInputReader.readStrings(STRING_COUNT);
        int maxLength = findMaxStringLength(strings);
        System.out.println("Strings with maximum length:");
        for (String str : strings) {
            if (maxLength == str.length()) {
                System.out.println(str);
            }
        }
    }

    private static int findMaxStringLength(List<String> strings) {
        int maxLength = 0;
        for (String str : strings) {
            if (maxLength < str.length()) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }
}
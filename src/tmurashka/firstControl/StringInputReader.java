package tmurashka.firstControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringInputReader {

    public static List<String> readStrings(int stringCount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < stringCount; i++) {
            strings.add(reader.readLine());
        }
        return  strings;
    }
}

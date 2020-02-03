package dmitrypolyakov.FirstControl;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 02.02.2020
 *
 * Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
 * Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
 * Cамые длинные строки будут выведены на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Loops3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> text = new ArrayList<String>();
        System.out.println("Введите поочередно пять строк текста. По завершении ввода нажмите Enter ");
        for (int i = 0; i < 5; i++) {
            text.add(i, reader.readLine());
        }
        int j = text.get(0).length();
        for (String value : text) {
            if (value.length() > j) {
                j = value.length();
            }
        }
        for (String s : text) {
            if (s.length() == j) {
                System.out.println(s);
            }
        }
    }
}

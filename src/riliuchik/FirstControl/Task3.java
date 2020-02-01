package riliuchik.FirstControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
 * Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
 * Cамые длинные строки будут выведены на экран.
 */

public class Task3 {
    private static final int SIZE = 5; //количество строк, которое необходимое считать с клавиатуры

    private BufferedReader reader;

    public Task3(BufferedReader reader) {
        this.reader = reader;
    }

    public void FindMaxStrings() throws IOException {

        //Создаем список строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Введите строку № " + (i + 1) + ": ");
            String str = reader.readLine();
            list.add(str);
        }

        //Находим самую длинную строку
        int maxLength = list.get(0).length();
        for (int i = 1; i < SIZE; i++) if (list.get(i).length() > maxLength) maxLength = list.get(i).length();

        //Выводим самые длинные строки
        System.out.println("\nСамые длинные строки:");
        for (int i = 0; i < SIZE; i++)
            if (list.get(i).length() == maxLength)
                System.out.println("Строка № " + (i + 1) + ": " + list.get(i));
    }
}
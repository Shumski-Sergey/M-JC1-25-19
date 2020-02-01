package iyakushevich.FirstControl;

import java.util.*;

/**
 * 3 Создадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
 * Затем с помощью цикла найдем из списка самую длинную строку (или несколько, если она такая не одна).
 * Самые длинные строки будут выведены на экран.
 */

public class Task3 {
    private static int MAP_LENGTH = 5;
    private static int MAX_LENGTH = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> stringLengthMap = new HashMap<>();

        System.out.println("Введите " + MAP_LENGTH + " строк: ");
        for (int i = 0; i < MAP_LENGTH; i++) {
            System.out.print(i + 1 + " строка: ");
            String line = scanner.nextLine();
            stringLengthMap.put(line, line.length());
            if (line.length() > MAX_LENGTH) MAX_LENGTH = line.length();
        }

        for (Map.Entry<String, Integer> entry : stringLengthMap.entrySet()
        ) {
            if (entry.getValue() == MAX_LENGTH) System.out.println(entry.getKey());
        }
    }
}

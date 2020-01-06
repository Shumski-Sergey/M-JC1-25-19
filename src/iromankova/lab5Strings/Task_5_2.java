package iromankova.lab5Strings;
// 2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Task_5_2 {
    public static void main(String[] args) throws IOException {

        // Инициализируем и определяем размер массива, который будет состоять из строк.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        String[] array = new String[Integer.parseInt(reader.readLine())];

        // Заполним массив строками
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку № " + (i + 1) + ": ");
            array[i] = reader.readLine();
        }

        // Используя Lambda-выражение определим параметры для реализации функции сравнения объектов интерфейса Comparator
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        // Сортируем массив строк по длине.
        Arrays.sort(array, comparator);

        for (String element : array) {
            System.out.println(element);
        }
        reader.close();
    }
}

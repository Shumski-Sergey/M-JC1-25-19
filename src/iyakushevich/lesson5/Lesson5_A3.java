package iyakushevich.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

public class Lesson5_A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(reader.readLine());

        String[] strings = new String[num];
        int[] size = new int[num];
        int middle = 0;

        //запись строк в массив и вычисление их длины
        for (int i = 0; i < num; i++) {
            System.out.print("Введите строку " + i + ": ");
            strings[i] = reader.readLine(); //массив строк
            size[i] = strings[i].length(); //массив длины
            middle += size[i];
            System.out.println("Длина строки: " + size[i]);
        }

        //вычисление стреднего значения
        middle /= num;

        //поиск самой короткой и самой длинной строк
        int min = size[0];
        for (int value : size) {
            if (min > value) min = value;
        }

        //вывод в консоль строк, короче средней длины
        System.out.println("Длина средней строки - " + middle + ". Строки, короче средней: ");
        for (int i = 0; i < num; i++) {
            if (size[i] < middle) System.out.println("Длина строки - " + size[i] + ": " + strings[i]);
        }
    }
}

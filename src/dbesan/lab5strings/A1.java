package dbesan.lab5strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Найти самую длинную и короткую строки
 */
public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк");
        int strcount = Integer.parseInt(reader.readLine()); //количество строк
        int max = 0; //максимум - будет выводиться
        int min = 0; //минимум - будет выводиться
        int temp = 0;
        AtomicReference<String> maxString = new AtomicReference<String>(); // замена предложеная идеей, самое длинное и самое короткое содержимое
        AtomicReference<String> minString = new AtomicReference<String>();
        for (int i = 0; i < strcount; i++) {
            String string = new String();
            System.out.println("Введите строку");
            string = reader.readLine();

            int length = 0;
            for (char character : string.toCharArray()) { //превращаем строку в массив чаров
                length = string.length();//длина строки
                temp = 0;
            }
            if (length > max) //выясняем макс и мин строки
            {
                max = length;
                maxString.set(string);//содержимое строки - тоже сама идея поменяла
            }
            if (min == 0) {
                min = length;
            }
            if (min > length) {
                min = length;
                minString.set(string);

            }
        }


        System.out.println("Максимальная строка: " + "Длина:" + max + " " + "Значение:" + maxString.get());
        System.out.println("Минимальная строка: " + "Длина:" + min + " " + "Значение:" + minString.get());
    }
}



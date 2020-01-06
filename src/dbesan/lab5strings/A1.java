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
        AtomicReference<String> maxString = new AtomicReference<String>(); // замена предложеная идеей макс и мин значения
        AtomicReference<String> minString = new AtomicReference<String>();
        for(int i = 0; i<strcount; i++){
            String string = new String();
            System.out.println("Введите строку");
            string = reader.readLine();
            int count = 0;
            for (char character : string.toCharArray()){ //превращаем строку в массив чаров
          count = string.length();//длина строки
            }
            if (count > max) //выясняем макс и мин строки
            {max = count;
            maxString.set(string);}//тоже сама идея поменяла
            temp = count;
            if (count < max && count<=temp)
            {min = count;
                minString.set(string);}//тоже сама идея поменяла


                        }
        System.out.println("Максимальная строка: " +max+" "+ maxString.get());
        System.out.println("Максимальная строка: " +min+" "+ minString.get());
        } }



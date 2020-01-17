package iyakushevich.lesson5;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//Если таких слов несколько, найти первое из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Lesson5_A4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(reader.readLine());

        String[] word = new String[num];    //массив слов
        int[] unique = new int[num];        //массив, содержащий количество уникальных символов

        //запись строк в массив и вычисление количества уникальных символов
        for (int i = 0; i < num; i++) {
            System.out.print("Введите " + i + " слово: ");
            word[i] = reader.readLine(); //записываем слово в массив слов
            System.out.print("Длина слова: " + word[i].length());

            int uniqueChar = word[i].length();                      //считаем все буквы уникальными
            //поиск количества уникальных символов в слове
            for (int j = 0; j < word[i].length(); j++) {            //выбираем j букву
                for (int k = j + 1; k < word[i].length(); k++) {    //сравниваем j букву с остальными
                    if (word[i].charAt(j) == word[i].charAt(k)) {   //если j буква равана оствальным,
                        uniqueChar--;                               //уменьшаем количество уникальных букв на 1
                        break;
                    }
                }
            }
            unique[i] = uniqueChar;
            System.out.println(". Количество уникальных символов: " + uniqueChar);
        }

        //вывод в консоль слова с минимальным количеством уникальных символов
        int min = unique[0];
        for (int i = 0; i < num - 1; i++) {
            if (unique[i + 1] < unique[i]) min = unique[i + 1];
            //System.out.println("Минимальное количество символов: " + min);
        }

        System.out.print("Свлово с минимальным количеством уникальных символов: ");
        for (int i = 0; i < num; i++) {
            if (unique[i] == min) {
                System.out.println(word[i]);
                break;
            }
        }
    }
}

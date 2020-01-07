package iyakushevich.lesson5;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
//   Если таких слов несколько, найти первое из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5_A6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество строк: ");
        int num = Integer.parseInt(reader.readLine());

        String[] word = new String[num];
        int[] size = new int[num];

        //запись строк в массив и вычисление их длины
        for (int i = 0; i < num; i++) {
            System.out.print("Введите " + i + " слово: ");
            word[i] = reader.readLine(); //записываем слово в массив слов
        }

        boolean consistent = true;                                  //буквы написаны последовательно?
        for (int i = 0; i < num; i++) {                             //проверяем каждое слово
            for (int j = 0; j < word[i].length() - 1; j++) {        //просматриваем все буквы в слове
                if ((word[i].charAt(j) + 1) == (int) word[i].charAt(j + 1)) consistent = true;
                else {
                    consistent = false;
                    break;
                }
            }
            //если все буквы в слове последовательны - печатаем первое и прерываем цикл
            if (consistent) {
                System.out.println("В слове \"" + word[i] + "\" все буквы написаны в порядке возрастания их кодов.");
                break;
            }
        }
    }
}

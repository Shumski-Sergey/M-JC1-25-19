package riliuchik.lab7_collections.Lab7_taskA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

//Создать коллекцию, наполнить ее случайными числами.
//Удалить повторяющиеся числа.

public class Lab7_taskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите максимальное значение для каждой из позиций в списке случайных чисел: ");
        int max = Integer.parseInt(in.readLine());
        System.out.println("Т.е. каждое число в списке будет лежать в промежутке от 1 до " + max + " включиетльно");
        List<Integer> randomList = RandomCreator.randomList(max);
        System.out.println("Список случайных чисел: " + randomList);
        List<Integer> onlyUnique = new ArrayList<>();
        for (Integer number : randomList) {
            if (onlyUnique.indexOf(number) == -1) onlyUnique.add(number); //-1, если не встречалось
        }
        System.out.print("Список из уникальных случайных чисел: " + onlyUnique);
    }
}
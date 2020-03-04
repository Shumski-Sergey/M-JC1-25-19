package tmurashka.control;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
 * а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят)
 */

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = readNumbers();
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();

        System.out.println("Max number is: " + max + "\nMin number is: " + min);
        System.out.println("Sum is: " + list.stream().filter(n -> n < max && n > min).mapToInt(n -> n).sum());
    }

    private static ArrayList<Integer> readNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}

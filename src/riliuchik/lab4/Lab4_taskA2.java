package src.riliuchik.lab4;

import java.util.Scanner;

//Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.

public class Lab4_taskA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов для массива: ");
        int num;
        do {
            while (!in.hasNextInt()) {
                System.out.print("Вы ввели не число, попробуйте ещё раз: ");
                in.next();
            }
            num = in.nextInt();
            if (num < 2) {
                System.out.print("Задача не имеет смысла при количестве элементов меньше 2, попробуйте ещё раз: ");
            }
        }
        while (num < 2);
        System.out.print("Тогда массив будет иметь следующий вид: ");
        int array[] = new int[num];
        int i;
        for (i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + " ");
        }
        int minIndex = 0;
        int min = array[minIndex];
        int maxIndex = 0;
        int max = array[maxIndex];
        for (i = 1; i < num; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("\nМинимальное и максимальное значения массива: " + min + " и " + max + " соответственно");
        int sum = 0;
        if (minIndex < maxIndex) {
            for (i = minIndex + 1; i < maxIndex; i++)
                sum += array[i];
        } else {
            for (i = maxIndex + 1; i < minIndex; i++)
                sum += array[i];
        }
        System.out.print("Сумма элементов между минимальным и максимальным значениями массива: " + sum);
    }
}
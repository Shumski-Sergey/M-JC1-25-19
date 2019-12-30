package iromankova.lab4Arrays.arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        System.out.print("Создаем массив. Введите число элементов массива (больше 1): ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElements;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели что-то другое. Повторите ввод! Введите число больше 1: ");
                scanner.next();
            }
            numberOfElements = scanner.nextInt();
            if (numberOfElements < 2) {
                System.out.println("Введенное вами число не больше 1. Попробуйте еще раз! Введите целое число больше 1: ");
            }
        } // Этот цикл для проверки правильности ввода числа
        while (numberOfElements < 2);
        int[] array = new int[numberOfElements];
        Random random = new Random();
        System.out.print("Заполняем массив случайными элементами: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Теперь перевернем массив и выведем на печать: ");
        for (int i = numberOfElements - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}

package iyakushevich.lesson3;

import java.util.Scanner;

public class Lesson3_A3 {
    public static void main(String[] args) {
        //creating array
        int[] array = new int[3];

        System.out.println("Ввелите три целых числа (ввод числа по нажатию Enter): ");
        //enter three numbers
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Отсортированный массив: ");
        //bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        //printing sorted array
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
    }
}

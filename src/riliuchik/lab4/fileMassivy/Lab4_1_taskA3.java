package riliuchik.lab4.fileMassivy;

import java.util.Scanner;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class Lab4_1_taskA3 {
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
        System.out.print("Первоначальный массив: ");
        int array[] = new int[num];
        int i, x;
        for (i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        for (i = 0; i < num / 2; i++) {
            x = array[i];
            array[i] = array[num - i - 1];
            array[num - i - 1] = x;
        }
        System.out.print("\nПеревернутый массив: ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
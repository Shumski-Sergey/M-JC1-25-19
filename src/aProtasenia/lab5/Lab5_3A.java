package aProtasenia.lab5;
//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив)

import java.util.Scanner;

public class Lab5_3A {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner summator = new Scanner(System.in);
        int size = summator.nextInt();
        int[] roll = new int[size];
        for (int i = 0; i < size; i++) {
            roll[i] = (int) (Math.random() * 10);
        }
        for(int i = 0; i < size; i++){
            System.out.print(roll[i] + " ");
        }
        for (int a = 0; a < size/2; a++) {
            int flip = roll[a];
            roll[a] = roll[size-1-a];
            roll[size-1-a] = flip;
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(roll[i] + " ");
        }

    }

}
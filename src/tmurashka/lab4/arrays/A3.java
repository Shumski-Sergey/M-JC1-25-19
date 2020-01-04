package tmurashka.lab4.arrays;

// Заполнить массив случайными элементами, распечатать, перевернуть, распечатать

import java.util.Random;

public class A3 {
    public static void main(String[] args) {
        int n = 10;
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int buffer = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = buffer;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

package iromankova.lab4Arrays.arrays;

import java.util.Random;

public class Task_4_1 {
    public static void main(String[] args) {
        int[] arrayMarks = new int[7]; // Создаем массив для внесения значений оценок, например, на 7 элементов
        System.out.print("У нас имеются оценки: ");
        Random random = new Random();
        for (int i = 0; i < arrayMarks.length; i++) {
            arrayMarks[i] = random.nextInt(10);
        }
        for (int x : arrayMarks) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Максимальная оценка под номером: ");
        int maxMark = arrayMarks[0];
        int numberOfMark = 0;
        for (int i = 1; i < arrayMarks.length; i++) {
            if (arrayMarks[i] > maxMark) {
                maxMark = arrayMarks[i];
                numberOfMark = i;
            }
        }
        System.out.println(numberOfMark);
    }
}

package iyakushevich.lesson4.tasksArrays;

//5. Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.

public class Lab_4_A5 {
    public static void main(String[] args) {
        int length = 0; //length of array

        for (int i = 2; i < 10000; i = 2 * i - 1) length++; //increasing length of array

        int[] array = new int[length]; //creating new array

        for (int i = 2, j = 0; i < 10000; i = 2 * i - 1, j++) {
            array[j] = i; //write to array
        }

        System.out.println("Количество элементов в массиве: " + array.length);

        System.out.print("Массив содержит следующую последовательность чисел: ");

        for (int i : array
        ) {
            System.out.print(i + " ");
        }
    }
}

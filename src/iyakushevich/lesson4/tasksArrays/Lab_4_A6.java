package iyakushevich.lesson4.tasksArrays;

//6. Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.

public class Lab_4_A6 {
    public static void main(String[] args) {
        System.out.println("Условие: Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.");
        int length = 0; //length of array

        for (int i = -166; i < 100; i = 2 * i + 200) {
            if (i > -100) length++; //increasing length of array
        }

        int[] array = new int[length]; //creating new array

        for (int i = -166, j = 0; j < length; i = 2 * i + 200) {
            if (i > -100 && i < 100) { //check if number has two digits
                array[j] = i; //write to array
                j++;
            }
        }

        System.out.println("Количество элементов в массиве: " + array.length);

        System.out.print("Массив содержит следующую последовательность чисел: ");

        for (int i : array
        ) {
            System.out.print(i + " ");
        }
    }
}

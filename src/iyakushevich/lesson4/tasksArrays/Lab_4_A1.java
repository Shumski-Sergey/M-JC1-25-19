package iyakushevich.lesson4.tasksArrays;

//1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Lab_4_A1 {
    public static void main(String[] args) {
        int count = ((9999 - 1000) / 3) + 1; //find length of array

        int[] array = new int[count];

        int num = 1000; //start number
        for (int i = 0; i < array.length; i++) { //writing in array
            array[i] = num;
            num += 3;
        }

        for (int a : array //printing from array
        ) {
            System.out.print(a + " ");
        }
    }
}

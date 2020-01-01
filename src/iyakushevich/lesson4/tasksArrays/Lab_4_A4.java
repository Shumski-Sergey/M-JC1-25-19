package iyakushevich.lesson4.tasksArrays;

//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Lab_4_A4 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0, num = 2; i < array.length; i++, num *= 2) {
            array[i] = num;
        }

        for (int a : array
        ) {
            System.out.print(a + " ");
        }
    }
}

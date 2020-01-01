package iyakushevich.lesson4.tasksArrays;

//3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Lab_4_A3 {
    public static void main(String[] args) {
        int start = 90, step = 5;

        int[] array = new int[start / step];
        array[0] = start;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] - step;
        }

        for (int a : array
        ) {
            System.out.print(a + " ");
        }
    }
}

package iyakushevich.lesson4.tasksArrays;

//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class Lab_4_A2 {
    public static void main(String[] args) {
        int[] array = new int[55]; //creating array

        for (int i = 0, j = 1; i < 55; i++, j += 2) array[i] = j; //i - index of array element, j = value

        for (int num : array) System.out.print(num + " "); //printing each element from array
    }
}

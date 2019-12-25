package iyakushevich.lesson4.tasksArrays;

//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class Lab_4_A2 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i < 55; i++) {
            System.out.print(j + " ");
            j +=2;
        }
    }
}

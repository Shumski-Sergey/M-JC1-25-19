package iyakushevich.lesson4.tasksArrays;

//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Lab_4_A4 {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 0; i < 20; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
    }
}

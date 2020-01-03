package riliuchik.lab4.fileZadachiMasivy;

//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Lab4_2_taskA4 {
    public static void main(String args[]) {
        int array[] = new int[20];
        int num = 2;
        System.out.println("Первые 20 элементов последовательности 2 4 8 16 32 64 128 …:");
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            System.out.print(array[i] + " ");
            num *= 2;
        }
    }
}
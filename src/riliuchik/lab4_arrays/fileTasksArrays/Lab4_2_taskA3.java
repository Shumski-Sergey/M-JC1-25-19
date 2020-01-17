package riliuchik.lab4_arrays.fileTasksArrays;

//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Lab4_2_taskA3 {
    public static void main(String args[]) {
        int n = 90 / 5 + 1;
        int array[] = new int[n];
        int num = 90;
        System.out.println("Все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …:");
        for (int i = 0; num >= 0; i++) {
            array[i] = num;
            System.out.print(array[i] + " ");
            num -= 5;
        }
    }
}
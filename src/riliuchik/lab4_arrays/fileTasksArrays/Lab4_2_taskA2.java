package src.riliuchik.lab4_arrays.fileTasksArrays;

//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class Lab4_2_taskA2 {
    public static void main(String args[]) {
        int array[] = new int[55];
        int num = 1;
        System.out.println("Первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …:");
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            System.out.print(array[i] + " ");
            num += 2;
        }
    }
}
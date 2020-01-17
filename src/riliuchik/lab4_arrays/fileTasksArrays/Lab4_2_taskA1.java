package riliuchik.lab4_arrays.fileTasksArrays;

//Создайте программу, выводящую на экран все четырёхзначные числа
//последовательности 1000 1003 1006 1009 1012 1015 ….

public class Lab4_2_taskA1 {
    public static void main(String args[]) {
        int n = (9999 - 1000) / 3 + 1; // арифметическая прогрессия An=A1+d*(n-1), где An<=9999, A1=1000, d=3
        int array[] = new int[n];
        int num = 1000;
        System.out.println("Все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 …:");
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            System.out.print(array[i] + " ");
            num += 3;
        }
    }
}
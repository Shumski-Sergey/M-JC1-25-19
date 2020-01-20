package src.riliuchik.lab4_arrays.fileTasksArrays;

//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.

public class Lab4_2_taskA6 {
    public static void main(String args[]) {
        int num = -166;
        int size = 0;
        while (num < -99) {
            num = 2 * num + 200;
            if (num > -100 && num < -9) {
                size++;
            }
        }
        while (num < 10) {
            num = 2 * num + 200;
        }
        while (num > 9) {
            num = 2 * num + 200;
            size++;
            if (num > 99) {
                num = (num - 200) / 2;
                break;
            }
        }
        int array[] = new int[size];
        int i;
        for (i = size - 1; i >= 0; i--) {
            array[i] = num;
            num = (num - 200) / 2;
        }
        System.out.print("Все двузначные члены последовательности 2an-1+200, где a1= –166: ");
        for (i = 0; i < size; i++) System.out.print(array[i] + " ");
    }
}
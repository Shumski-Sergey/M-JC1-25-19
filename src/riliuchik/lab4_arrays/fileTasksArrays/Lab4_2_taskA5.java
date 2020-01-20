package src.riliuchik.lab4_arrays.fileTasksArrays;

//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.

public class Lab4_2_taskA5 {
    public static void main(String args[]) {
        int size = 1;
        int last = 2;
        while (last < 10000) {
            last = 2 * last - 1;
            size++;
            if (last >= 10000) {
                last = last / 2 + 1;//строчка нужна, если потом захотим вывести последнее число до объявления массива
                size--;
                break;
            }
        }
        int array[] = new int[size];
        int i;
        int num = 2;
        array[0] = num;
        for (i = 1; i < size; i++) {
            num = 2 * num - 1;
            array[i] = num;
        }
        System.out.print("Члены последовательности 2an-1–1, где a1=2, которые меньше 10000: ");
        for (i = 0; i < size; i++) System.out.print(array[i] + " ");
    }
}
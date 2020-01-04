package iyakushevich.lesson4.arrays;

//1.В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

public class Lab4_A1 {
    public static void main(String[] args) {
        int size = 5 + (int)(Math.random()*10); //generating array length
        int max = 0; //the highest score
        System.out.print("Количество элементов в массиве: " + size + '\n');

        int[] array = new int[size];

        System.out.print("Массив содержит следующие значения: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
            System.out.print(array[i] + " ");
            if (max < array[i]) max = array[i];
        }

        /*System.out.print('\n' + "Нумерация элементов массива:        ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }*/

        System.out.print('\n' + "Максимальная оценка " + max + " хранится в элементах массива под номером ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) System.out.print(i + " ");
        }



    }
}

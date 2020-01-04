package iyakushevich.lesson4.arrays;

//2. Определите сумму элементов массива, расположенных между минимальным
//и максимальным значениями.

public class Lab4_A2 {
    public static void main(String[] args) {
        int size = 5 + (int) (Math.random() * 10);                   //generating array length
        System.out.print("Количество элементов в массиве: " + size + '\n');
        int[] array = new int[size];

        int maxValue = 100;                                          //number for random values

        for (int i = 0; i < array.length; i++) {                     //generating random values for array
            array[i] = (1 + (int) (Math.random() * maxValue - 1));
        }

        int rand1 = (int) (Math.random() * array.length - 1);        //index for max value
        int rand2;
        do {
            rand2 = (int) (Math.random() * array.length - 1);       //index for min value = 0
        } while ((Math.abs(rand2 - rand1)) < 2);

        array[rand1] = maxValue;   //assignment of maximum value
        array[rand2] = 0;          //assignment of minimum value

        System.out.print("Массив содержит следующие значения: ");   //printing generated array
        for (int a : array
        ) {
            System.out.print(a + " ");
        }

        int first = 0, second = 0;                  //finding values fron min to max
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                first = i;
                //System.out.print(i + " ");
            }
            if (array[i] == maxValue) {
                second = i;
                //System.out.print(i + " ");
            }
        }

        if (first > second) {       //if first index bigger than second - swap them
            int temp = first;
            first = second;
            second = temp;
        }

        System.out.print('\n' + "Последовательность чисел между " + array[first] + " и " + array[second] + " значениями: ");
        for (int i = first + 1; i < second; i++) {
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        System.out.print('\n' + "Сумма чисел между " + array[first] + " и " + array[second] + " равна: ");
        for (int i = first + 1; i < second; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

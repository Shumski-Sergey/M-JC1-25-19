package iyakushevich.lesson4.arrays;

//3.Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class Lab4_A3 {
    public static void main(String[] args) {
        int size = 5 + (int) (Math.random() * 10); //generating array length
        System.out.print("Количество элементов в массиве: " + size + '\n');

        int[] array = new int[size];

        System.out.print("Массив содержит следующие значения: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.print('\n' + "Перевернутый массив: " + '\t' + '\t' + '\t' + '\t');
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length/2) break;
            int temp;
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int a : array
        ) {
            System.out.print(a + " ");
        }
    }
}

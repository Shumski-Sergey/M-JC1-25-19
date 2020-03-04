package iromankova.secondControl;
//1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
//а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).

import java.util.Random;

public class Task_1 {
    static final int LENFTH_OF_ARRAY = 10;
    static final int RANGE_OF_NUMBERS = 6;
    public static void main(String[] args) {
        int maxNum;
        int minNum;

        int[] arrayNumbers = createMassive ();

        maxNum = arrayNumbers[0];
        minNum = arrayNumbers[0];

        for (int i=1; i<arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNum) {
                maxNum = arrayNumbers[i];
            }
            if (arrayNumbers[i] < minNum) {
                minNum = arrayNumbers[i];
            }
        }
        System.out.println("\n"+maxNum);
        System.out.println(minNum);
        int counter=0;
        printMassive (maxNum, minNum, arrayNumbers, counter);
    }

    private static void printMassive(int maxNum, int minNum, int[] arrayNumbers, int counter) {
        for (int arrayNumber : arrayNumbers) {
            if ((arrayNumber != maxNum) & (arrayNumber != minNum)) {
                counter = counter + arrayNumber;
            }
        }
        System.out.println(counter);
    }

    private static int[] createMassive() {
        int[] arrayNumbers = new int[LENFTH_OF_ARRAY];
        Random random = new Random();
        for (int i =0; i<arrayNumbers.length; i++){

            arrayNumbers[i] = random.nextInt(RANGE_OF_NUMBERS);
        }
        for (int x:arrayNumbers ){
            System.out.print(x+" ");
        }
        return arrayNumbers;
    }

}

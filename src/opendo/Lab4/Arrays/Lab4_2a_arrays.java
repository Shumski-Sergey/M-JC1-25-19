import java.util.Scanner;

public class Lab4_2a_arrays {
    /*Определите сумму элементов массива, расположенных между минимальным
и максимальным значениями.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int numb = in.nextInt(); //создаём размер массива в консоли
        System.out.print("Enter elements of the array (using space): ");
        int[] array = new int[numb]; // заполняем массив элементами через пробел
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        int maxNumb = 0;
        int indexMax = 0;
        int minNumb = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            maxNumb = Math.max(maxNumb, array[i]); // определяется максимальное число
            minNumb = Math.min(minNumb, array[i]); // определяется минимальное число
            if (array[i] > array[indexMax]) { // отпределяется индекс максимальноого числа в массиве
                indexMax = i;
            }
            if (array[i] < array[indexMin]) { // отпределяется индекс минимального числа в массиве
                indexMin = i;
            }

        }

        int sum = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }
        System.out.println("Sum of the array elements between minimum and maximum values " + sum);
    }
}

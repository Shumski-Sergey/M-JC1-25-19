package tmurashka.lab4.arrays;

//Определите сумму элементов массива, расположенных между минимальным и максимальным значениями

public class A2 {
    public static void main(String[] args) {
        int[] array = {11,2,-3,8,4,55,5,6,7,8,9,10};
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        if (minIndex > maxIndex){
            int b = minIndex;
            minIndex = maxIndex;
            maxIndex = b;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

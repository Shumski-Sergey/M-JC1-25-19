package src.irusy;

import java.lang.*;
import java.util.Arrays;


public class MassivZad2 {
    private static final int N = 10;
    private static final int MIN = 1;
    private static final int MAX = 9;

    public static void main(String[] args) {
        int[] array = createArray(N, MIN, MAX);
        System.out.println("Array: " + Arrays.toString(array));
        int min = getMin(array);
        int[] indexesMin = getNumberIndexesInArray(array, min);
        System.out.printf("Min number in array = %d; his indexes equal: %s;\n", min, Arrays.toString(indexesMin));

        int max = getMax(array);
        int[] indexesMax = getNumberIndexesInArray(array, max);
        System.out.printf("Max number in array = %d; his indexes equal: %s;\n", max, Arrays.toString(indexesMax));

        summRangeBetweenMinAndMax(array, indexesMin, indexesMax);
    }

    private static int[] getNumberIndexesInArray(int[] array, int number) {
        int[] indexes = new int[0];
        if (array != null && array.length > 0) {
            indexes = new int[array.length];
            int count = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] == number) {
                    indexes[count++] = index;
                }
            }
            indexes = Arrays.copyOf(indexes, count);
        }
        return indexes;
    }

    private static int[] createArray(int size, int min, int max) {
        int[] array = new int[size > 0 ? size : 0];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    private static int getMin(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int min = array[0];
            for (int number : array) {
                if (min > number) {
                    min = number;
                }
            }
            result = min;
        }
        return result;
    }

    private static int getMax(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int number : array) {
                if (max < number) {
                    max = number;
                }
            }
            result = max;
        }
        return result;
    }

    private static void summRangeBetweenMinAndMax(int[] array, int[] indexesMin, int[] indexesMax) {
        if (array != null && indexesMin != null && indexesMax != null) {
            for (int min : indexesMin) {
                for (int max : indexesMax) {
                    int start = Math.min(min, max);
                    int end = Math.max(min, max);
                    int sum = 0;
                    for (int index = start; index <= end; index++) {
                        System.out.print(array[index] + " ");
                        sum += array[index];
                        if (index != end) {
                            System.out.print("+ ");
                        }
                    }
                    System.out.println("= " + sum + ";");
                }
            }
        }
    }
}

package aantonovich.Training;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 98, 22, 15, 46, 28, 7, 1};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
//        Arrays.sort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
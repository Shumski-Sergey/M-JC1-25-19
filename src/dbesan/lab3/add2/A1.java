package dbesan.lab3.add2;

/**
 * Индекс максимального элемента
 **/
public class A1 {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 5, 8, 3, 6, 9, 19, 12, 14, 13};
        int max = arr[0];
        int maxInx = 0;
        for (int i = 0; i < arr.length; i++) {//maximum element and its index

            if (arr[i] > max) {
                max = arr[i];
                maxInx = i;
            }
        }
        System.out.print("Индекс максимального элемента: " + maxInx);
    }
}

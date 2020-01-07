package dbesan.lab3.add2;

/**
 * Находим сумму мужду максимальным и минимальным значениям в массиве, не включая их
 **/
public class A2 {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 5, 8, 3, 6, 9, 19, 12, 14, 13}; //test - min earlier then max
        //int arr[] = {4,70,5,8,6,9,19,1,14,13}; //test 2 - max earlier then min
        int max = arr[0];
        int min = arr[0];
        int maxInx = 0; //maximum index
        int minInx = 0;//minimum index
        int result = 0;
        for (int i = 0; i < arr.length; i++) {//maximum element and its index

            if (arr[i] > max) {
                max = arr[i];
                maxInx = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {//minimum element and its index
            if (arr[i] < min) {
                min = arr[i];
                minInx = i;
            }
        }
        if (minInx < maxInx) {// summary between maximum and minimum
            for (int i = (minInx + 1); i < maxInx; i++) //minimum comes early then maximum
            {
                result = result + arr[i];
            }
        }
        else {
            for (int i = (maxInx + 1); i < minInx; i++)//maximum comes early then minimum
            {
                result = result + arr[i];
            }
        }
        System.out.print(result);
    }
}
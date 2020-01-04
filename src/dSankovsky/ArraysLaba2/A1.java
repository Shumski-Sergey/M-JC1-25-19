package dSankovsky.ArraysLaba2;

public class A1 {

    public static void main(String[] args) {
//print sum of elements between max and min elements
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);  //add random numbers in array
            System.out.print(arr[i] + " ");
        }

        int max = 0, numbMax = 0;
        for (int i = 0; i < arr.length; i++) {   //search max value and number in array
            if (max < arr[i]) {
                max = arr[i];
                numbMax = i;
            }
        }
        System.out.println();
        System.out.println("Max Value: " + max + " Number: " + numbMax);
    }
}
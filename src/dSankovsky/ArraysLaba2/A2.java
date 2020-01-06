package dSankovsky.ArraysLaba2;

public class A2 {
    public static void main(String[] args) {
//print sum of elements between max and min elements
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);  //add random values in array
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = 0, min = 0, numbMin = 0, numbMax = 0;
        for (int i = 0; i < arr.length; i++) {   //search max value and number in array
            if (i == 0) {
                max = arr[i];   //if max/min element is first
                min = arr[i];
            }

            if (max < arr[i]) {  //searching max/min element and their numbers
                max = arr[i];
                numbMax = i;
            } else if (min > arr[i]) {
                min = arr[i];
                numbMin = i;
            }
        }
        if (numbMax < numbMin) {   //switch max and min number for using universal cycle
            int temp;
            temp = numbMax;
            numbMax = numbMin;
            numbMin = temp;
        }

        int sum = 0;
        for (int i = numbMin; i <= numbMax; i++) {
            sum += arr[i];
        }

        System.out.println("Min Value: " + min + " Number: " + numbMin);
        System.out.println("Max Value: " + max + " Number: " + numbMax);
        System.out.println("Sum: " + sum);
    }
}

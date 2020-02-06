package tabukara.lab4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements inside the array: ");
        int n = in.nextInt();
        int array[] = new int[n];
        int i;
        System.out.print("the elements of array are: ");
        for (i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");

        }

        int maxine = 0;
        int max = array[maxine];
        int minine = 0;
        int min = array[minine];
        for (i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                maxine = i;
            }
            if (array[i] < min) {
                min = array[i];
                minine = i;
            }
        }
        System.out.print("\nThe maximum element is: " + max + " \nand the minimum element is: " + min);

        int sm = 0;
        int sum = array[sm];
        System.out.print("\nAll elements between the maximum and the minimum are: ");
        for (i = 0; i < n; i++) {
            if (array[i] < max && array[i] > min) {
                sum = array[i];
                sm = i;
                System.out.print(sum + " ");
            }

        }


    }
}

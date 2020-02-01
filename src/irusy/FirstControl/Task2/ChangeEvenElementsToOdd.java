package src.irusy.FirstControl.Task2;

import java.util.Scanner;

public class ChangeEvenElementsToOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        System.out.print("Enter elements: ");
        CustomArrayList<Integer> nums = new CustomArrayList<>();
        for(int i = 0; i < n; i++)
            nums.add(input.nextInt());

        nums.shift();
        System.out.print("Elements in edited ArrayList: ");
        for(int num : nums)
            System.out.printf("%d ", num);
    }
}

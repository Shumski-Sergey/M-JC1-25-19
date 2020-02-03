package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public  void replacing() {
        final int constant = 2;
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list_b = new ArrayList<>();
        System.out.print("Enter the size of the list:  ");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.print("Enter integers please:  ");
            list_b.add(in.nextInt());
        }
        System.out.print("The list before Changes = " + list_b);

        //replacing the elements
        for (int i = 1; i < s; i++) {
            if (list_b.get(i) % constant == 0) {
                list_b.set(i, list_b.get(i - 1));
            }
        }
        System.out.print("\nThe list after Changes: " + list_b);

    }
}

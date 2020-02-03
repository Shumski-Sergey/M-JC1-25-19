package question2;

import java.util.ArrayList;
import java.util.Scanner;
//not ready
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ms = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            System.out.print("Enter the element: ");
            ms.add(sc.nextInt());
        }
        int i;

        for (i = 0; i < ms.size(); i++) {
            if (ms.get(i) % 2 == 0) {
               ms.get(i-1);
            }


        }System.out.print("the list after changes: " + ms);
    }
}
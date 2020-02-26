package a.mitsura.FirstControl;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//   filling the list with random and the scanner is asking
//   to enter the value of numbers which will fill arraylist
        int scanNum = getScanNum(list);
        System.out.println("Your list consists of: " + list);
            for (int f = 1; f < scanNum; f++) {
                if (f % 2 == 0) {
//   setting every second number on his left brother-number
                    list.set(f, list.get(f - 1));
                }
            }
            System.out.println("Your new list consists of: " + list);
        }

    public static int getScanNum(ArrayList<Integer> list) {
        System.out.println("Enter the value of numbers which will fill the list");
        Scanner randomNum = new Scanner(System.in);
        int scanNum = randomNum.nextInt();
        for (int i = 0; i < scanNum; i++) {
            list.add(i, (int) (Math.random() * 100 + 1));
        }
        return scanNum;
    }
}
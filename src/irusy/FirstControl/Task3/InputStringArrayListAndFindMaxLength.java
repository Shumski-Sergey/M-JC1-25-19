package src.irusy.FirstControl.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class InputStringArrayListAndFindMaxLength {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        MyStringArrayList list = new MyStringArrayList();
        for(int i = 0; i < 5; i++){
            list.add(input.nextLine());
        }

        ArrayList<String> ans = list.findMax();

        for(String s : ans){
            System.out.println(s);
        }

    }
}

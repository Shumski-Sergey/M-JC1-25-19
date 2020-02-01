package src.yuhnovskaya.FirstControl.Task2;

import java.util.List;
import java.util.Scanner;

public class Fill_List {
    List list;

    public Fill_List(List list) {
        this.list = list;
    }
    /**The method FillList(List list) calls the Scanner, that reads strings from the console
     until empty string is entered. Then it adds the entered strings to the list.
     */
    public static void FillList(List list) {
        System.out.println("Fill list");
        Scanner scanner=new Scanner(System.in);

        while (true){
            String str=scanner.nextLine();
            if (str.isEmpty())break;
            list.add(str);
        }
    }
}

package src.yuhnovskaya.FirstControl.Task2;
//Заменить каждый элемент списка с четным номером на соседний слева элемент.

import java.util.LinkedList;

import static src.yuhnovskaya.FirstControl.Task2.Even_To_Odd.EvenToOdd;
import static src.yuhnovskaya.FirstControl.Task2.Fill_List.FillList;

public class Runner_LinkedList {
    public static void main(String[]avgs){
        LinkedList list=new LinkedList();


        FillList(list);
        EvenToOdd(list);

        System.out.println("Result");
        System.out.println(list);
    }
}

package src.yuhnovskaya.FirstControl.Task2;
//Заменить каждый элемент списка с четным номером на соседний слева элемент.

import java.util.ArrayList;

import static src.yuhnovskaya.FirstControl.Task2.Even_To_Odd.EvenToOdd;
import static src.yuhnovskaya.FirstControl.Task2.Fill_List.FillList;

public class Runner_ArrayList {
    public static void main(String[] avgs) {
        ArrayList list=new ArrayList();

        FillList(list);
        EvenToOdd(list);

        System.out.println("Result:");
        System.out.println(list);
    }
}

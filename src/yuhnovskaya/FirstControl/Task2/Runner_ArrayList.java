package src.yuhnovskaya.FirstControl.Task2;
//Заменить каждый элемент списка с четным номером на соседний слева элемент.

import java.util.ArrayList;

public class Runner_ArrayList {
    public static void main(String[] avgs) {
        ArrayList list=new ArrayList();
        Fill_List fl=new Fill_List(list);
        Even_To_Odd eto=new Even_To_Odd(list);

        fl.FillList(list);
        eto.EvenToOdd(list);

        System.out.println("Result:");
        System.out.println(list);
    }
}

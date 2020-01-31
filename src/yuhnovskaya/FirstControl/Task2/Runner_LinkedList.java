package src.yuhnovskaya.FirstControl.Task2;
//Заменить каждый элемент списка с четным номером на соседний слева элемент.

import java.util.LinkedList;

public class Runner_LinkedList {
    public static void main(String[]avgs){
        LinkedList list=new LinkedList();
        Fill_List fl=new Fill_List(list);
        Even_To_Odd eto=new Even_To_Odd(list);

        fl.FillList(list);
        eto.EvenToOdd(list);

        System.out.println("Result");
        System.out.println(list);
    }
}

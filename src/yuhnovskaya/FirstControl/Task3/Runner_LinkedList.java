package src.yuhnovskaya.FirstControl.Task3;

import java.util.LinkedList;

import static src.yuhnovskaya.FirstControl.Task3.Fill_List.FillList;
import static src.yuhnovskaya.FirstControl.Task3.Max_Length.MaxLength;

public class Runner_LinkedList {
    public static void main(String[]avgs){
        LinkedList<String> list=new LinkedList<>();
        final int LIST_SiZE=5;

        FillList(list,LIST_SiZE);
        System.out.println("\nThe longest strings:");
        for (int i=0;i<LIST_SiZE;i++){
            if ((list.get(i)).length()==MaxLength(list)){
                System.out.println(list.get(i));
            }
        }
    }
}

package src.yuhnovskaya.FirstControl.Task3;

import java.util.LinkedList;

public class Runner_LinkedList {
    public static void main(String[]avgs){
        LinkedList<String> list=new LinkedList<>();
        final int LIST_SiZE=5;
        Fill_List fl=new Fill_List(list,LIST_SiZE);
        Max_Length ml=new Max_Length(list);

        fl.FillList(list,LIST_SiZE);
        System.out.println("\nThe longest strings:");
        for (int i=0;i<LIST_SiZE;i++){
            if ((list.get(i)).length()==ml.MaxLength(list)){
                System.out.println(list.get(i));
            }
        }
    }
}

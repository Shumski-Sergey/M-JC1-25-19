package src.yuhnovskaya.FirstControl.Task3;
//Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их
// в список. Затем с помощью цикла найдем из списка самую длинную строку
// (или несколько, если она такая не одна). Cамые длинные строки будут выведены на экран.

import java.util.ArrayList;
import java.util.List;

import static src.yuhnovskaya.FirstControl.Task3.Fill_List.FillList;
import static src.yuhnovskaya.FirstControl.Task3.Max_Length.MaxLength;

public class Runner_ArrayList {
    public static void main(String[] avgs){
        List<String> list=new ArrayList<>();
        final int LIST_SIZE=5;

        FillList(list, LIST_SIZE);
        System.out.println("\nThe longest strings:");
        for (int i=0; i<LIST_SIZE; i++) {
            if ((list.get(i)).length() == MaxLength(list)) {
                System.out.println(list.get(i));
            }
        }
    }
}

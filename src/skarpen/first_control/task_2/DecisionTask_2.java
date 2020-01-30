package src.skarpen.first_control.task_2;

import java.util.ArrayList;
import java.util.List;

public class DecisionTask_2 {

    public static void main(String[] args) {
        //2. Заменить каждый элемент списка с четным номером на соседний слева элемент.
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add((i));
        }
        for (Integer d : arrayList) {
            System.out.print(d + " ");
        }
        System.out.println("\n");
        System.out.println(arrayList.size());
        System.out.println("\n");


        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.indexOf(i) % 2== 0) {
                arrayList.set(i, i-1);
            }
        }
        for (Object asd : arrayList) {
            System.out.print(asd + " ");
        }

        System.out.println("\n");
        System.out.println(arrayList.size());
        System.out.println("\n" + "the end");

    }
    }



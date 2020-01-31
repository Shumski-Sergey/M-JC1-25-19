package src.yuhnovskaya.FirstControl.Task2;

import java.util.List;

public class Even_To_Odd {
    List list;

    public Even_To_Odd(List list) {
        this.list = list;
    }
    /*The method EvenToOdd(List list) is looking for even number of list element and changes its value
    with the value of previous number
     */
    public void EvenToOdd(List list){
        for (int i=2; i<list.size(); i++) {
            if (i%2==0) {
                list.set(i, (list.get(i - 1)));
            }
        }
    }
}

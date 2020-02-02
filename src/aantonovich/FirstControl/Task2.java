package aantonovich.FirstControl;

import java.util.ArrayList;

// Заменить каждый элемент списка с четным номером на соседний слева элемент
public class Task2 {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int elements = 16;
        for (int i = 0; i < elements; i++){
            list.add(i,(int) (Math.random()*100 +1));
        }
        System.out.println("Original list: " + list);
        for (int j = 1; j < elements; j++){
            if( j%2 == 0){
                list.set(j,list.get(j-1)) ;
            }
        }
        System.out.println("List after change: " + list);
    }
}
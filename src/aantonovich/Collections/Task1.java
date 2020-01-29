package aantonovich.Collections;

import java.util.ArrayList;
import java.util.Iterator;

// Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка
public class Task1 {
    public static void main(String[] args) {
        int element = 10;
        int negative = 3;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            mark.add(i,(int) (Math.random() * 10 + 1));
        }
        System.out.println(mark);
        Iterator<Integer> it;
        for (it = mark.iterator(); it.hasNext(); )
        if (it.next() <= negative)
            it.remove();
        System.out.println(mark);
    }
}

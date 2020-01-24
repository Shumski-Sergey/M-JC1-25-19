package src.yuhnovskaya.Lab8.Collections.A4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
public class Declaration {
    public static Object array() {
        java.util.List<Object> list = new ArrayList<>();
        return list;
    }
    public static Object linked(){
        java.util.List<Object> list=new LinkedList<>();
        return list;
    }
}

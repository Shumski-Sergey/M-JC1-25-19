package src.yuhnovskaya.dateTimeAPI.task2;

import java.time.LocalDate;
import static src.yuhnovskaya.dateTimeAPI.task2.IsDateOdd.isDateOdd;

////Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года (когда количество дней
//// с начала года — нечётно). Выясним, можем ли мы сегодня отдохнуть на Небуле-1. Для этого реализуем метод
//// isDateOdd(String date), возвращающий true, если количество дней с начала года — нечётное число, иначе false.
public class Runner {
    public static void main(String[] avgs){
        LocalDate today = LocalDate.now();
        String strToday=today.toString();
        System.out.print("Today is "+today+"\nThe flight is available: "+isDateOdd(strToday));
    }
}

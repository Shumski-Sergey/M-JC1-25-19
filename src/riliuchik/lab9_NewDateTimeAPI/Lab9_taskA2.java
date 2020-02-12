package riliuchik.lab9_NewDateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года
 * (когда количество дней с начала года — нечётно). Выясним, можем ли мы сегодня отдохнуть на Небуле-1.
 * Для этого реализуем метод isDateOdd(String date), возвращающий true,
 * если количество дней с начала года — нечётное число, иначе false.
 */

public class Lab9_taskA2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String date = today.toString();
        if (isDateOdd(date)) System.out.print("Ура, мы сегодня сможем отдохнуть на Небуле-1!");
        else System.out.print("К сожалению, мы сегодня не сможем отдохнуть на Небуле-1.");
    }

    private static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int days = LocalDate.parse(date, formatter).getDayOfYear() - 1;
        return days % 2 != 0;
    }
}
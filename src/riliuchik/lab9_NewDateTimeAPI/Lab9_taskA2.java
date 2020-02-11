package riliuchik.lab9_NewDateTimeAPI;

import java.io.IOException;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года
 * (когда количество дней с начала года — нечётно). Выясним, можем ли мы сегодня отдохнуть на Небуле-1.
 * Для этого реализуем метод isDateOdd(String date), возвращающий true,
 * если количество дней с начала года — нечётное число, иначе false.
 */

public class Lab9_taskA2 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите дату 2020 года в формате dd.MM.yyyy: ");
        String date = in.readLine();
        boolean check = isDateOdd(date);
        if (check) System.out.print("Ура, мы сегодня можем отдохнуть на Небуле-1!");
        else System.out.print("К сожалению, мы сегодня не сможем отдохнуть на Небуле-1.");
    }

    private static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat("dd.MM.yyyy");
        Date dateCurrent = parser.parse(date);
        Date dateYear = parser.parse("01.01.2020");
        long milliseconds = dateCurrent.getTime() - dateYear.getTime();
        int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
        return days % 2 != 0;
    }
}
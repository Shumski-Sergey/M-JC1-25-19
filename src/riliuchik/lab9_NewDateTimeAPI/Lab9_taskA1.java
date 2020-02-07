package riliuchik.lab9_NewDateTimeAPI;

import java.text.SimpleDateFormat;
import java.sql.Timestamp;

/**
 * Узнать день недели и вывести его, если у нас дана дата в String формате или timeStamp.
 */

public class Lab9_taskA1 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        String dayOfTheWeek = formatter.format(new Timestamp(System.currentTimeMillis()));
        System.out.print("Сегодня " + dayOfTheWeek);
    }
}
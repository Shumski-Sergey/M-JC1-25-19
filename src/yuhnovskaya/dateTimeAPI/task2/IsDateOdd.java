package src.yuhnovskaya.dateTimeAPI.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IsDateOdd {
    private String date;

    private IsDateOdd(String date) {
        this.date = date;
    }
    public static boolean isDateOdd(String date){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int numOfDays= LocalDate.parse(date,dtf).getDayOfYear();
        if (numOfDays%2!=0)
        {return true;}
        else {return false;}
    }
}

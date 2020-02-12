package src.yuhnovskaya.dateTimeAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Узнать день недели и вывести его, если у нас есть дана дата в String формате или timeStamp
public class Task1 {
    public static void main(String[] avgs) throws IOException {
        System.out.println("Enter date in format 'dd-MM-yyyy':");
        BufferedReader reader=new BufferedReader((new InputStreamReader(System.in)));
        String date=reader.readLine();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DayOfWeek dayOfWeek=LocalDate.parse(date,dtf).getDayOfWeek();
        System.out.print("Day of week is: "+dayOfWeek);
    }
}

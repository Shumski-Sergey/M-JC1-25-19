package iromankova.lab11DateTimeAPI;
/*1. Узнать день недели и вывести его, если у нас есть дана дата в String формате или timeStamp*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task_1 {
    // Согласно условию задачи у нас есть дата в String формате:
    private final static String DATE_1 = "11.02.2020";
    private final static String DATE_2 = "2020-02-12";

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(DATE_1, dateTimeFormatter);
        System.out.println(DATE_1 + " - " + localDate.getDayOfWeek());

        // Вариант вывода дня недели на русском языке:
        DayOfWeek dayOfWeek = LocalDate.parse(DATE_2).getDayOfWeek();
        Locale localeRu = new Locale("ru", "RU");
        System.out.println(DATE_2 + " - " + dayOfWeek.getDisplayName(TextStyle.FULL, localeRu));
    }
}

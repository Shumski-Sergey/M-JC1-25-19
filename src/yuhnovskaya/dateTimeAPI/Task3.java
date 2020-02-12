package src.yuhnovskaya.dateTimeAPI;
//Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось
// до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
//Входные данные
//Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
//Выходные данные
//Программа должна вывести количество дней, оставшихся до Нового года.
// Если введены неверные данные, нужно вывести число -1.

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] avgs){
        System.out.println("Enter number of month and day:");
        Scanner scanner=new Scanner(System.in);
        String mon_day=scanner.nextLine();
        try {
            //determination of month number:
            Pattern pattern_month = Pattern.compile("^[0-9]+\\b");
            Matcher month = pattern_month.matcher(mon_day.trim());
            int numMonth = 0;
            while (month.find()) {
                numMonth = Integer.parseInt(mon_day.trim().substring(month.start(), month.end()));
            }
            //determination of day number:
            Pattern pattern_day = Pattern.compile("\\b[0-9]+");
            Matcher day = pattern_day.matcher(mon_day.trim());
            int numDay = 0;
            while (day.find()) {
                numDay = Integer.parseInt(mon_day.trim().substring(day.start(), day.end()));
            }
            //determination of number of days since the beginning of the year:
            int year=Integer.parseInt((Year.now().toString()));
            if (year%4==0) {
                year = year + 1; // if calculated year is a leap year;
            }
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-M-d");
        int numOfDays= LocalDate.of(year, numMonth,numDay).getDayOfYear();
        //determination of days befor the new year:
        int ToNewYear=365-numOfDays;
        System.out.print("Befor the New Year is "+ToNewYear+" days");
    } catch(Exception ex) {
            System.out.print("-1");
        }
    }
}

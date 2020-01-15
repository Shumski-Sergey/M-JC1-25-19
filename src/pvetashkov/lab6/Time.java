package pvetashkov.lab6;
import java.io.BufferedReader;
import java.io.*;
public class Time {
    public int days, hours, minutes, seconds;

    public Time(int days, int hours, int minutes, int seconds) {
        this.seconds=seconds;
        this.minutes=minutes;
        this.hours=hours;
        this.days=days;
    }
    public static void main(String[] args) throws IOException{
        Time time=new Time("1","23","15","09");
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Enter any time");
       // String str=br.readLine();
       // String date[]=str.split(":");

System.out.print( time);
}

    }

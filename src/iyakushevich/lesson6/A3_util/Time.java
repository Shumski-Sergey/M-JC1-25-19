package iyakushevich.lesson6.A3_util;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getSecTime() {
        return (hours * 3600 + minutes * 60 + seconds);
    }

    public void compareTime(Time compareTo) {
        System.out.println("Разница во времени " + (this.getSecTime() - compareTo.getSecTime()) + " секунд.");
        if (this.getSecTime() > compareTo.getSecTime()) System.out.println("Первый период времени больше второго.");
        else if (this.getSecTime() < compareTo.getSecTime()) System.out.println("Второй период времени больше первого.");
        else System.out.println("Промежутки времени равны.");
    }

}

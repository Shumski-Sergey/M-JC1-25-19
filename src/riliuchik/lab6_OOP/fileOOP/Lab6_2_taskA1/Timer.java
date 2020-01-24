package riliuchik.lab6_OOP.fileOOP.Lab6_2_taskA1;

public class Timer {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private static final int CONST = 60;

    public Timer(int originallySeconds) {
        this.seconds = originallySeconds % CONST;
        int minutes = (originallySeconds - this.seconds) / CONST;
        this.minutes = minutes % CONST;
        this.hours = (minutes - this.minutes) / CONST;
    }

    public Timer(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int secFormat() {
        return this.hours * CONST * CONST + this.minutes * CONST + this.seconds;
    }

    public void compareTo(Timer forCompare) {
        if (this.secFormat() < forCompare.secFormat())
            System.out.print("Первый промежуток времени меньше второго промежутка времени");
        else if (this.secFormat() > forCompare.secFormat())
            System.out.print("Первый промежуток времени больше второго промежутка времени");
        else System.out.print("Первый промежуток времени равен второму промежутку времени");
    }
}
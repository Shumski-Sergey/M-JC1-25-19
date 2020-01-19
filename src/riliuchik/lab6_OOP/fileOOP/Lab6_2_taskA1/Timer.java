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

    public int printSeconds() {
        int seconds = this.seconds;
        seconds += this.minutes * CONST;
        seconds += this.hours * CONST * CONST;
        return seconds;
    }

    public int compareTo(Timer forCompare) {
        if (hours != forCompare.hours) return Integer.compare(hours, forCompare.hours);
        else if (minutes != forCompare.minutes) return Integer.compare(minutes, forCompare.minutes);
        else return Integer.compare(seconds, forCompare.seconds);
    }
}
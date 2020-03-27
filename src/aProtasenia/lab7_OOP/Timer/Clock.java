package aProtasenia.lab7_OOP.Timer;

public class Clock {
    private int sec, min, hour;

    public Clock(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
    public Clock(int sec) {
        this.sec = sec;
    }
    public int Seconds() {
        return (hour * 60 + min) * 60 + sec;
    }

}

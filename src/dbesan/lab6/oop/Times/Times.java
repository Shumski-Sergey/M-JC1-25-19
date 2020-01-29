package dbesan.lab6.oop.Times;

public class Times {
    private int hour;
    private int minute;
    private int seconds;

    public void TimeInterval(int h, int m, int s) {
        hour = h;
        minute = m;
        seconds = s;
    }

    public void TimeInterval(int allsec) {
        seconds = allsec;
    }

    public int returnAllSecond() {
        return hour * 3600 + minute * 60 + seconds;
    }
}

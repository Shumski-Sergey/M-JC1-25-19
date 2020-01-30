package tmurashka.lab6.OOP.A1;

public class HoursTime {
    private int hours;
    private int minutes;
    private int seconds;

    public HoursTime(int seconds){
        hours = seconds / 3600;
        seconds %=3600;
        minutes = seconds / 60;
        seconds %=60;
        this.seconds = seconds;
    }

    public HoursTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getFullSeconds() {
        return  hours * 3600 + minutes * 60 + seconds;
    }

    public int compareTo(HoursTime to) {
        int res = this.getFullSeconds() - to.getFullSeconds();
        if (res == 0) {
            return res;
        }
        return res / Math.abs(res);
    }

    @Override
    public String toString() {
        String res = hours + ":" + minutes + ":" + seconds;
        return res;
    }
}

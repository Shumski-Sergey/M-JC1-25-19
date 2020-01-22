package yuhnovskaya.Lab7_OOP.A1;
// constructor of interval in hour+min+sec
public class Interval {
    private int hour;
    private int min;
    private int sec;

    public Interval() {
    }

    public Interval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    //number of seconds:
    public int numsec() {
        int numsec = hour* 3600 + min * 60 + sec;
        return numsec;
    }

    // comparing of two objects:
    public int compInt(Interval anotherInterval) {
        int result=this.numsec()-anotherInterval.numsec();
        return result;
    }
}

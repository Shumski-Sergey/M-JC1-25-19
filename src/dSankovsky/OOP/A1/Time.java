package dSankovsky.OOP.A1;

public class Time extends Constants {
    private int sec;
    private int min;
    private int hours;

    public Time(int hours, int min, int sec) {
        this.setHours(hours);
        this.setMin(min);
        this.setSec(sec);
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec >= MIN_TO_SEC) {
            setMin(min + (sec - sec % MIN_TO_SEC) / MIN_TO_SEC);
            this.sec = sec % MIN_TO_SEC;
        } else if (sec >= 0) {
            this.sec = sec;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= HOURS_TO_MIN) {
            setHours(hours + (min - min % HOURS_TO_MIN) / HOURS_TO_MIN);
            this.min = min % HOURS_TO_MIN;
        } else if (min >= 0) {
            this.min = min;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

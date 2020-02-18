package dSankovsky.OOP.A1;

public class TimeOperations<T> extends Constants {

    public long AllSeconds(Time time) {
        return time.getSec() + time.getMin() * MIN_TO_SEC + time.getHours() * HOURS_TO_SEC;
    }

    public String TimeCompare(Time time1, Time time2) {
        if (AllSeconds(time1) - AllSeconds(time2) > 0) {
            return "First time > second time";
        } else if (AllSeconds(time1) - AllSeconds(time2) < 0) {
            return "First time < second time";
        } else {
            return "First time = second time";
        }
    }

    public int GetSeconds(Time time) {
        return time.getSec();
    }

    public int GetMinutes(Time time) {
        return time.getMin();
    }

    public int GetHours(Time time) {
        return time.getHours();
    }

    public void PrintResult(T t) {
        System.out.println(t);
    }
}

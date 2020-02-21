package dSankovsky.OOP.A1;
//operations with time
public class Runner {
    public static void main(String[] args) {
        TimeOperations timeOperations = new TimeOperations();
        Time time1 = new Time(11, 75, 92);
        Time time2 = new Time(120, 479, 60);
        System.out.println(time1.getHours() + ":" + time1.getMin() + ":" + time1.getSec());
        System.out.println(time2.getHours() + ":" + time2.getMin() + ":" + time2.getSec());

        timeOperations.PrintResult(timeOperations.AllSeconds(time2));
        timeOperations.PrintResult(timeOperations.TimeCompare(time1,time2));
        timeOperations.PrintResult(timeOperations.GetHours(time1));
        timeOperations.PrintResult(timeOperations.GetMinutes(time1));
        timeOperations.PrintResult(timeOperations.GetSeconds(time1));

    }
}

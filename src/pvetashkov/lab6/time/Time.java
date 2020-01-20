package pvetashkov.lab6.time;

public class Time {
    private String nomer;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(String nomer, int hours, int minutes, int seconds){
        this.nomer=nomer;
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public String getNomer(){return nomer;}
    public void setNomer(){this.nomer=nomer;}
    public int getHours(){return hours;}
    public void setHours(){this.hours=hours;}
    public int getMinutes(){return minutes;}
    public void setMinutes(){this.minutes = minutes;}
    public int getSeconds(){return seconds;}
    public void setSeconds(){this.seconds=seconds;}

}

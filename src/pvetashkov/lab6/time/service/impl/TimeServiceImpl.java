package pvetashkov.lab6.time.service.impl;
import pvetashkov.lab6.time.Time;
import pvetashkov.lab6.time.service.TimeService;
public class TimeServiceImpl implements TimeService{
   //private Object longiness;

    public TimeServiceImpl() {
    }
    private int dlinatotal (Time time) {return time.getHours()*3600+time.getMinutes()*60+time.getSeconds();}
    @Override
    public int vivodtotal(Time time, Time timetwo) {
        return dlinatotal(time)>dlinatotal(timetwo)? dlinatotal(time):dlinatotal(timetwo);
    }
    //private int dlinatotaltwo(Time time) {return time.getHours()*3600+time.getMinutes()*60+time.getSeconds();}
   // @Override
   // public int vivodtotaltwo(Time timetwo){
   //     return dlinatotal(timetwo);
   // }
    private String dlina (Time time) {return time.getNomer();}
    @Override
    public String vivod(Time time, Time timetwo) {
        return dlinatotal (time)>dlinatotal(timetwo)?dlina(time):dlina(timetwo);
    }

}

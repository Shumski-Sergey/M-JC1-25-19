package pvetashkov.lab6.time;
import pvetashkov.lab6.time.service.impl.TimeServiceImpl;
public class Runner {
    public static void main(String[] args){
        TimeServiceImpl service=new TimeServiceImpl();
        Time time=new Time("one",13,45,56);
        Time timetwo=new Time ("two",16,25,59);
        String vivod=service.vivod(time, timetwo);
        int vivodtotal=service.vivodtotal(time, timetwo);
        System.out.println(vivod);
        System.out.println(vivodtotal);
    }
}

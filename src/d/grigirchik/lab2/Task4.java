package d.grigirchik.lab2;

public class Task4 {
    public static void main(String[] args) {
        int s = 604800+86400+3600+60+1;
        int sec;
        int m;
        int min;
        int h;
        int hours;
        int days;
        int d;
        int weeks;
        sec = s % 60; //неделимый остаток - это секунды
        m = (s - sec) / 60; //кол-во целых минут
        min = m % 60; //неделимый остаток - это минуты
        h = (m - min) / 60; //кол-во часов
        hours = h % 24 ; //неделимый остаток это часы
        d=(h-hours)/24;//дни
        days=(d%7);//неделимый остаток это дни
        weeks=(d-days)/7;
        System.out.println(weeks+" недели "+days+" Дней "+hours+" Часов "+ min+ " минут "+ sec + " секунд");
    }
}

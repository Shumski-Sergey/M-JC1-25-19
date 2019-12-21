package tabukara.lab1;

public class task2 {
    public static void main(String[] args){
        int s = 3700;
        int sec,m,min,h,day,d,k,wek;
        sec = s % 60;
        m = (s-sec) /60;
        min = m % 60;
        h = (m-min) /60;
        d = h % 24;
        day = (h-d) /24;
        wek = day % 7;
        k = (day-wek) /7;
        System.out.println(k + "Weeks" + d + "Days" + h + "Hours" + min + "Minute" + sec + "second");
    }
}

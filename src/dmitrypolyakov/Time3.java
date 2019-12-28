package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.12.2019
 */
public class Time3 {
    public static void main(String[] args) {
        int s = 923720;
        int sec;
        int m;
        int min;
        int h;
        int hours;
        int d;
        int deys, w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 60;
        d = (h - hours) / 24;
        deys = d % 24;
        w = (d - deys) / 7;
        System.out.println(w + " недель " + deys + " дней " + hours + " часов " + min + " минут " + sec + " скунд");
    }
}
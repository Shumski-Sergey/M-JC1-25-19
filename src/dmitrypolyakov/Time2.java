package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.12.2019
 */
public class Time2 {
    public static void main(String[] args) {
        int s = 923720;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минут " + sec + " скунд");
    }
}

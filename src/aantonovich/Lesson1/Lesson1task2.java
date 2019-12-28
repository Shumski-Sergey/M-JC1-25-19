package aantonovich.Lesson1;

public class Lesson1task2 {
    public static void main (String[] args) {
        int s = 90060000;
        int m, min, h;
        int sec = s % 60;
        m = (s-sec)/60;
        min = m % 60;
        h = (m-min)/60;
        int hour = h % 24;
        int d = (h-hour)/24;
        int day = d % 7;
        int w = (d-day)/7;
                System.out.println(w + "недель" + day + "дней" + hour + "часов" + min + "минут" + sec + "секунд");
    }
}

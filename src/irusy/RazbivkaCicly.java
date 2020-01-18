package src.irusy;
import java.text.NumberFormat;
import java.util.Locale;


public class RazbivkaCicly {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getInstance(new Locale("ru", "RU"));
        int i = 333222111;
        System.out.println(f.format(i));
    }

}

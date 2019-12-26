package aantonovich;

import java.text.NumberFormat;

public class Lesson3task3 {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getInstance();
        Long i = 7554378367678L;
        System.out.println(f.format(i));
    }
}
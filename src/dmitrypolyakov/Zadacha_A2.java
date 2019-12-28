package dmitrypolyakov;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 20.12.2019
 */
public class Zadacha_A2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = 6;
        double d = Math.pow(b, 2) - 4 * a * c;
        float x = 0;
        float y = 0;
        if (d == 0) {
            x = -1 * (b / (2 * a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + x);
        } else {
            if (d > 0) {
                x = (-b + (float) Math.sqrt(d)) / (2 * a);
                y = (-b - (float) Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + x + " и " + y);
            } else {
                System.out.println("Корней нет");
            }
        }
    }
}

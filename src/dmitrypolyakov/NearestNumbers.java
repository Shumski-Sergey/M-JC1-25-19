package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 20.12.2019
 */
public class NearestNumbers {
    public static void main(String[] args) {
        double x = 10.0;
        double m = 8.5;
        double n = 11.45;
        if (x - m < n - x) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }
    }
}
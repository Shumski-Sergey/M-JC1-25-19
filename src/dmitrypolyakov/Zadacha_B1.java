package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 25.12.2019
 */
public class Zadacha_B1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 150 + 1) + 5;
        if (a <= 25 || a >= 100) {
            System.out.println("Число " + a + " не содержится в интервале (25 - 100)");
        } else {
            System.out.println("Число " + a + " содержится в интервале (25 - 100)");
        }
    }
}
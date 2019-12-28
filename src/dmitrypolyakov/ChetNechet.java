package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 18.12.2019
 */
public class ChetNechet {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 21);
        System.out.println("Случайное число: " + a);
        if ((a % 2) == 0) {
            System.out.println(" число " + a + " четное");
        } else {
            if ((a % 1) == 0) {
                System.out.println(" число " + a + " нечетное");
            }
        }
    }
}

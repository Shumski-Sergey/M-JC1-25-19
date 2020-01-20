package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000
 */

public class Loops5 {
    public static void main(String[] args) {
        for (int a = 2; a < 10000; a = 2 * a - 1) {
            System.out.print(a + " ");
        }
    }
}
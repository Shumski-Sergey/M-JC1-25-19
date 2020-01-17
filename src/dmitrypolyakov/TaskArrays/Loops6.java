package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166
 */

public class Loops6 {
    public static void main(String[] args) {
        for (int a = -166; a < 100; a = 2 * a + 200) {
            if (a > -100 & (a < -9 || a > 9))
                System.out.print(a + " ");
        }
    }
}
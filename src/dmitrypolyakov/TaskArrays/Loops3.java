package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …
 */


public class Loops3 {
    public static void main(String[] args) {
        for (int a = 95; a > 0; a -= 5) {
            System.out.print(a + " ");
        }
    }
}
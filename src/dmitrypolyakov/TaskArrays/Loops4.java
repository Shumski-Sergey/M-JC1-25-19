package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
 */

public class Loops4 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a <= 20; a++, b = b * 2) {
            System.out.print(b + " ");
        }
    }
}
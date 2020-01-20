package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 *
 * Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
 */

public class Loops2 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a <= 55; a ++, b = b +2) {
            System.out.print(b + " ");
        }
    }
}
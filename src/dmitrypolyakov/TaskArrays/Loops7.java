package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
 */

import java.util.Scanner;

public class Loops7 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            int y = 1;
            for (int i = 1; i <= n; i++) {
                y = y * i;
            }
            System.out.print("факториал чила " + n + " равен  ");
            System.out.print(y);
        }
    }
}
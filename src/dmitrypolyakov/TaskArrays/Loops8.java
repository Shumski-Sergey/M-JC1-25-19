package dmitrypolyakov.TaskArrays;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 17.01.2020
 * <p>
 * Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры
 */

import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int a;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Делителями числа " + a + " являются ");
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0)
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("Ошибка. Введено не число");
        }
    }
}
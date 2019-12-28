package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 25.12.2019
 */

import java.util.Scanner;

public class Zadacha_B3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до " + n +  " равна " + sum);
    }
}

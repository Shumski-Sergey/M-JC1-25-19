package tmurashka.lab3;

import java.util.Scanner;

public class lab3_B3 {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextInt();
        if (n > 0) {
            int m = (int)((1 + n) / 2 * n);
            System.out.print("Сумма чисел от 1 до " + (int)n + " = " + m );
        }
        else {
            System.out.println("Вы ввели неверное число");
        }

    }
}

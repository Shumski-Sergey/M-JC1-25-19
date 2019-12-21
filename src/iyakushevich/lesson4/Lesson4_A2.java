package iyakushevich.lesson4;

import java.util.Scanner;

//2. Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.
public class Lesson4_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { //повторение для удобства проверки нескольких чисел
            int num = scanner.nextInt(); //ввод числа
            int isSimple = 0;
            //инкрементируем isSimple каждый раз при делении без остатка,
            //но простыми будут только числа со значением isSimple == 2;

            for (int i = 1; i <= num; i++) {
                if (num == 0 || num == 1) break; //игнорируем 0 и 1
                else if (num % i == 0) {
                    isSimple++;
                }
            }

            if (isSimple == 2) System.out.println("Число является простым.");
            else System.out.println("Число не является простым.");
        }
    }
}

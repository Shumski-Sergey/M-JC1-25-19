package iyakushevich.lesson4;

import java.util.Scanner;

//1. Имеется целое число. Следует посчитать сумму цифр данного числа.
public class Lesson4_A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //вводим число
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int sum = 0; //начальная сумма всех цифр
        do {
            int i = n % 10; //ищем остаток при делении на 10 - этот остаток и есть последняя цифра в числе
            sum += i; //прибавляем остаток к сумме
            n = n / 10; //убираем последнее число
        } while (n > 0);
        System.out.println("Сумма всех цифр равна " + sum);
    }
}

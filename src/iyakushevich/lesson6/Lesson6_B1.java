package iyakushevich.lesson6;

import iyakushevich.lesson6.B1_util.Money;

import java.util.Scanner;

/**
 * B1. Класс Деньги для работы с денежными суммами.
 * Число должно быть представлено двумя полями: типа long для рублей и типа char - для копеек.
 * Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
 * Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
 * умножение на дробное число и операции сравнения.
 * В функции main проверить эти методы.
 */

public class Lesson6_B1 {
    public static void main(String[] args) {
        while (true) {
            Money money1 = new Money();
            money1.readMoney();
            Money money2 = new Money();
            money2.readMoney();

            Money.sum(money1, money2);
            Money.compare(money1, money2);
        }
    }
}

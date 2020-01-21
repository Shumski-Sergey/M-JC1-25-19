package iyakushevich.lesson6.B1_util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * B1. Класс Деньги для работы с денежными суммами.
 * Число должно быть представлено двумя полями: типа long для рублей и типа char - для копеек.
 * Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
 * Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
 * умножение на дробное число и операции сравнения.
 * В функции main проверить эти методы.
 */

public class Money {
    long paperMoney;
    char coins;

    public void readMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(line);

        matcher.find();
        paperMoney = Long.parseLong(matcher.group());
        matcher.find();
        coins = (char) Integer.parseInt(matcher.group());

//        System.out.println(paperMoney);
//        System.out.println((int) coins);
    }

    public static void sum(Money money1, Money money2) {
        long paperSum = money1.paperMoney + money2.paperMoney;
        char coinsSum = (char) (money1.coins + money2.coins);
        if (coinsSum > 99) {
            paperSum += coinsSum / 100;
            coinsSum = (char) (coinsSum % 100);
        }
        System.out.println("Сумма равна: " + paperSum + "," + (int) coinsSum);
    }

    public static void compare(Money money1, Money money2) {
        Money max = (double) money1.paperMoney + (double) money1.coins / 100 >
                (double) money2.paperMoney + (double) money2.coins / 100 ?
                money1 : money2;
        System.out.println("Число " + max.paperMoney + "," + (int) max.coins + " больше.");
    }
}

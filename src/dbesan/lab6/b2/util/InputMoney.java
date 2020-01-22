package dbesan.lab6.b2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.valueOf;

public class InputMoney {
    public static final long PENNY_VALUE = 100;//сколько десятков уходит под копейки
    public static final int PENNY_DOT = 2;//сколько отделяем точкой
    public static long InputRub() throws IOException {
        long rubles1 = getRubles();
        char pennych = getPennych();
        long penny = valueOf(pennych);
        long rubles = (rubles1 * PENNY_VALUE)+penny; //получаем сумму всю в long
        return rubles;
    }

    private static char getPennych() throws IOException {
        System.out.println("Введите копейки");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        return (char) Integer.parseInt(reader1.readLine());
    }

    private static long getRubles() throws IOException {
        System.out.println("Введите рубли");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}

package src.skarpen.lesson_7.lab7_3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
        //в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
        //20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
        //снимающую деньги. На вход передается сумма денег. На выход – булевское
        //значение (операция удалась или нет). При снятии денег функция должна
        //рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
        //конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
        //усмотрение.

        CashMachine cashMachine = new CashMachine(3, 50, 100);
        BalanceMoney status = new BalanceMoney();
        System.out.println(status.balanceMoney(cashMachine));

    }
}



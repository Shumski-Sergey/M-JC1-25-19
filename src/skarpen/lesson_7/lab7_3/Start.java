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

        CashMachine cashMachine = new CashMachine(20, 50, 100);

        Scanner sc = new Scanner(System.in);
        System.out.println(cashMachine.allMoney() + " All money in ATM" + "\n" + "select denomination:" + "\n" + " 20 / 50 / 100 "); //номинал купюры
        int newGreenback = sc.nextInt();
        System.out.println("amount needed for removal: "); //Сколько купюр надо снять
        int howNewGreenback = sc.nextInt();

        if (newGreenback == 20) {
            System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback + " All money in ATM");
        }
        if (newGreenback == 50) {
            System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback + " All money in ATM");
        }
        if (newGreenback == 100) {
            System.out.println(cashMachine.allMoney() - howNewGreenback * newGreenback + " All money in ATM");
        }
        System.out.println("ATM close");// лажа
    }
}



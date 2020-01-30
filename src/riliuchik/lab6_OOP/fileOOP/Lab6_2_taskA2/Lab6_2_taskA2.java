package riliuchik.lab6_OOP.fileOOP.Lab6_2_taskA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
//в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
//20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
//усмотрение.

public class Lab6_2_taskA2 {
    public static void main(String[] args) throws IOException {
        Cash_dispenser ATM = new Cash_dispenser(15, 10, 5);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("В устройстве доступны банкноты на сумму " + ATM.getBudget_of_ATM() + " руб.:");
        System.out.println("номиналом " + ATM.getBanknote20() + " руб.: " + ATM.getQuantityOf20() + " шт.");
        System.out.println("номиналом " + ATM.getBanknote50() + " руб.: " + ATM.getQuantityOf50() + " шт.");
        System.out.println("номиналом " + ATM.getBanknote100() + " руб.: " + ATM.getQuantityOf100() + " шт.");
        System.out.print("Введите 1 для операции снятия или 2 для операции пополнения: ");
        int type = Integer.parseInt(in.readLine());
        switch (type) {
            case 1:
                System.out.print("Введите желаемую сумму для снятия: ");
                ATM.setAmount(Integer.parseInt(in.readLine()));
                while (!ATM.budget_after_withdrawal(ATM.getAmount())) {
                    System.out.println("В устройстве доступны банкноты номиналом только 20 руб., 50 руб. и 100 руб. на общую сумму " + ATM.getTemp());
                    System.out.print("Введите желаемую сумму для снятия: ");
                    ATM.setAmount(Integer.parseInt(in.readLine()));
                }
                break;
            case 2:
                System.out.print("Введите желаемую сумму для пополнения: ");
                ATM.setAmount(Integer.parseInt(in.readLine()));
                ATM.budget_after_refill();
                System.out.print("Операция выполнена, доступная сумма в устройстве: " + ATM.getBudget_of_ATM() + " руб.");
                break;
        }
    }
}
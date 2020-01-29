package tmurashka.lab6.OOP.A2;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
//в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
//20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
//усмотрение.

public class BankRunner {
    public static void main(String[] args) {
        ATM atm = new ATM(10, 7, 3);
        System.out.println(atm.getMoney(300));
    }
}

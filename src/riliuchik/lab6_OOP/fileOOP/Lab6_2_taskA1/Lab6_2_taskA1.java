package riliuchik.lab6_OOP.fileOOP.Lab6_2_taskA1;

//Создать класс и объекты описывающие промежуток времени.
//Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте,
//сравнения двух объектов (метод должен работать аналогично compareTo в строках).
//Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
//Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class Lab6_2_taskA1 {
    public static void main(String[] args) {
        Timer period1 = new Timer(10000);
        Timer period2 = new Timer(3, 4, 5);
        System.out.println("Первый промежуток времени: " + period1.printSeconds() + " сек или "
                + period1.getHours() + " ч " + period1.getMinutes() + " мин " + period1.getSeconds() + " сек");
        System.out.println("Второй промежуток времени: " + period2.printSeconds() + " сек или "
                + period2.getHours() + " ч " + period2.getMinutes() + " мин " + period2.getSeconds() + " сек");
        if (period1.compareTo(period2) > 0)
            System.out.print("Первый промежток времени больше второго промежутка врмени");
        else if (period1.compareTo(period2) < 0)
            System.out.print("Первый промежток времени меньше второго промежутка врмени");
        else System.out.print("Первый промежток времени равен второму промежутку врмени");
    }
}
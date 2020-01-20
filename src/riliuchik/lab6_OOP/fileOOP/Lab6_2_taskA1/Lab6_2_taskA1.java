package src.riliuchik.lab6_OOP.fileOOP.Lab6_2_taskA1;

//Создать класс и объекты описывающие промежуток времени.
//Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте,
//сравнения двух объектов (метод должен работать аналогично compareTo в строках).
//Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
//Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class Lab6_2_taskA1 {
    public static void main(String[] args) {
        Timer first = new Timer(10000);
        Timer second = new Timer(3, 4, 5);
        System.out.println("Первый промежуток времени: " + first.secFormat() + " сек или "
                + first.getHours() + " ч " + first.getMinutes() + " мин " + first.getSeconds() + " сек");
        System.out.println("Второй промежуток времени: " + second.secFormat() + " сек или "
                + second.getHours() + " ч " + second.getMinutes() + " мин " + second.getSeconds() + " сек");
        first.compareTo(second);
    }
}
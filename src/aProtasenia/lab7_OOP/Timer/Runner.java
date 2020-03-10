package aProtasenia.lab7_OOP.Timer;
/*.Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

public class Runner {
    public static void main(String[] args) {

        Clock one = new Clock(151, 36, 12);
        Clock two = new Clock(767978);

        System.out.println(one.Seconds());
        System.out.println(two.Seconds());
        String cmp = one.Seconds() > two.Seconds() ?
                "Первый интервал времени больше второго"
                : one.Seconds() < two.Seconds() ?
                "Первый интервал времени меньше второго"
                :
                "Первый интервал времени равен второму";
        System.out.println(cmp);
        }
    }



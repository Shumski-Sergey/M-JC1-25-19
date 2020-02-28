package riliuchik.lab11_multithreading.Lab11_taskA1;

import java.util.ArrayList;

import static riliuchik.lab11_multithreading.Lab11_taskA1.Service.startService;

/**
 * Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 * Некоторые из них можна выдавать на руки некоторые только в читальный зал.
 * Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
 */

public class Main {
    static final ArrayList<Library> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(new Library("\"Шантарам\"", true, true));
        books.add(new Library("\"Мастер и Маргарита\"", true, false));
        books.add(new Library("\"Три товарища\"", true, true));
        books.add(new Library("\"Цветы для Элджернона\"", true, false));
        books.add(new Library("\"Над пропастью во ржи\"", true, true));
        books.add(new Library("\"Портрет Дориана Грея\"", true, false));
        books.add(new Library("\"Маленький принц\"", true, true));
        books.add(new Library("\"Вино из одуванчиков\"", true, false));
        books.add(new Library("\"Атлант расправил плечи\"", true, true));
        books.add(new Library("\"Убить пересмешника\"", true, false));

        startService("Иванов");
        startService("Смирнов");
        startService("Кузнецов");
        startService("Попов");
        startService("Васильев");
    }
}
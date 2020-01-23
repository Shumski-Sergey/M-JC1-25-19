package riliuchik.lab7_collections.Lab7_taskA3;

import java.util.List;
import java.util.ArrayList;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class Lab7_taskA3 {
    public static void main(String[] args) {
        List<Pupils> pupils = new ArrayList<>();
        pupils.add(new Pupils("Александр", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Михаил", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Максим", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Артем", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Иван", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Даниил", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Марк", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Лев", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("София", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Мария", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Анна", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Алиса", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Виктория", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Екатерина", (byte) (Math.random() * 11)));
        Lists lists = new Lists();
        System.out.println("Список учеников:");
        lists.classRegister(pupils);
        System.out.print("\nУченик с самой высокой оценкой: " + lists.bestPupil(pupils));
    }
}
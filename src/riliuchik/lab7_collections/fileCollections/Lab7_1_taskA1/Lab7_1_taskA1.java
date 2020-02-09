package riliuchik.lab7_collections.fileCollections.Lab7_1_taskA1;

import java.util.List;
import java.util.ArrayList;

//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

public class Lab7_1_taskA1 {
    public static void main(String[] args) {
        List<Pupils> pupils = new ArrayList<>();
        pupils.add(new Pupils("Александра", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Валентина", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Галина", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Дарья", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Евгения", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Алексей", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Борислав", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Вадим", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Геннадий", (byte) (Math.random() * 11)));
        pupils.add(new Pupils("Даниил", (byte) (Math.random() * 11)));
        Lists lists = new Lists();
        System.out.println("Полный список учеников:");
        lists.classRegister(pupils);
        System.out.println("\nСписок учеников с удовлетворительными оценками:");
        lists.classRegister(lists.satisfactory(pupils));
    }
}
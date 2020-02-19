package riliuchik.generics.taskA1;

import java.util.Arrays;

/**
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 * Реализовать метод, который возвращает любой элемент массива по индексу.
 */

public class MainTaskA1 {
    private static final int INDEXFORINTEGER = 3;
    private static final int INDEXFORSTRING = 5;

    public static void main(String[] args) {
        Universal<Integer> integerList = new Universal<>();
        integerList.setList(Arrays.asList(5, 10, 15, 20, 25, 30));
        integerList.getElementByIndex(INDEXFORINTEGER);

        Universal<String> stringList = new Universal<>();
        stringList.setList(Arrays.asList("мама", "папа", "сестра", "брат", "бабушка", "дедушка"));
        stringList.getElementByIndex(INDEXFORSTRING);
    }
}
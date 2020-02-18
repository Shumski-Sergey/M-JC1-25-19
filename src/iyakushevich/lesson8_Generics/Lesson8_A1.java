package iyakushevich.lesson8_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 * Реализовать метод, который возвращает любой элемент массива по индексу.
 */

public class Lesson8_A1 {
    public static void main(String[] args) {
        A1Generic<Integer> generic1 = new A1Generic<>();
        generic1.setArrayList(Arrays.asList(1, 2, 3));
        System.out.println("integer " + generic1.getElement(1));

        A1Generic<Double> generic2 = new A1Generic<>();
        generic2.setArrayList(Arrays.asList(1.11d, 1.22d, 1.33d));
        System.out.println("double \t" + generic2.getElement(2));

        A1Generic<String> generic3 = new A1Generic<>();
        generic3.setArrayList(Arrays.asList("One", "Two", "Three"));
        System.out.println("String \t" + generic3.getElement(1));
    }
}

class A1Generic<T> {
    List<T> arrayList = new ArrayList<>();

    public List<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<T> arrayList) {
        this.arrayList = arrayList;
    }

    public T getElement(int element) {
        return getArrayList().get(element);
    }
}

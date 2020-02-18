package iyakushevich.lesson8_Generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2. Написать ф-ю, которая сохранит содержимое каталога(class Catalog<T>) в массив и
 * выведет первые 5 элементов на экран.
 */

public class Lesson8_A2 {
    public static String[] STRINGS = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
    public static Integer[] INTEGERS = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        Catalog<String> stringCatalog = new Catalog<>();
        stringCatalog.printCatalog(stringCatalog.scanCatalog(STRINGS));

        System.out.println();

        Catalog<Integer> integerCatalog = new Catalog<>();
        integerCatalog.printCatalog(integerCatalog.scanCatalog(INTEGERS));
    }
}

class Catalog<T> {
    ArrayList<T> arrayList = new ArrayList<>();

    public ArrayList<T> scanCatalog(T[] catalog) {
        arrayList.addAll(Arrays.asList(catalog));
        return arrayList;
    }

    public void printCatalog(ArrayList<T> catalog) {
        for (int i = 0; i < 5; i++) {
            System.out.println(catalog.get(i));
        }
    }
}

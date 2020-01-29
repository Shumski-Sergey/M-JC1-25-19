package iyakushevich.lesson7;

import iyakushevich.lesson7.A4_util.ListOperations;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
 * Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 */

public class Lesson7_A4 extends ListOperations {
    public static void main(String[] args) {
        System.out.print("Выполнение операций с ArrayList... ");
        ListOperations.listOperations(new ArrayList<>());
        System.out.print("Выполнение операций с LinkedList... ");
        ListOperations.listOperations(new LinkedList<>());

        System.out.print("Выполнение операций с LinkedList... ");
        ListOperations.listOperations(new LinkedList<>());
        System.out.print("Выполнение операций с ArrayList... ");
        ListOperations.listOperations(new ArrayList<>());
    }
}

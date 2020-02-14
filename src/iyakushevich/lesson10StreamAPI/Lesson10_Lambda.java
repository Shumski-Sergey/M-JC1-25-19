package iyakushevich.lesson10StreamAPI;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Напишите калькулятор 1 методом. Метод должен принимать 2 цифровых значения и кое-что ещё.
 */

public class Lesson10_Lambda {
    public static void main(String[] args) {
        String operation = new Scanner(System.in).nextLine();
        String[] strings = operation.split("\\b");
        /*System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);*/
        calculate(strings);

    }

    public static double calculate(String[] s) {
        Stream.of(s).forEach(System.out::println);
        return 1.0d;
    }
}

package d.grigirchik.lab3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int limit1 = 5;
        int limit2 = 155;
        int a = 5 + (int) (Math.random() * (limit2 - limit1 + 1));
        System.out.println("Случайное число: " + a);
        if (a > 25 && a < 100) {
            System.out.println("Случайное число: " + a + " находиться в интервале (25;100)");
        } else {
            System.out.println("Случайное число: " + a + " не входит в интервал (25;100)");
        }
    }
}


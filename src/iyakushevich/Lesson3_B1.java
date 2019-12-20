package iyakushevich;

import static java.lang.Math.random;

public class Lesson3_B1 {
    public static void main(String[] args) {
        int n = 5 + (int) (random() * 150);
        if (n >= 25 && n <= 100) System.out.println("Число " + n + " находится в пределах от 25 до 100.");
        else System.out.println("Число " + n + " не находится в пределах от 25 до 100.");
    }
}

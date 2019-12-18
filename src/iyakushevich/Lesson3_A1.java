package iyakushevich;

import static java.lang.Math.*;

public class Lesson3_A1 {
    public static void main(String[] args) {
        int x = 10;
        int a = 11, b = 45;
        int closest;

        closest = (abs((x - a)) < abs((x - b))) ? a : b;
        System.out.println(closest);
    }
}
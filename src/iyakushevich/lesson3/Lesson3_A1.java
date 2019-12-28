package iyakushevich.lesson3;

import static java.lang.Math.*;

public class Lesson3_A1 {
    public static void main(String[] args) {
        //this is our basic number
        double x = 10;

        //setting two random numbers
        double a = (random()*100);
        System.out.println("Первое число: " + a);
        double b = (random()*100);
        System.out.println("Второе число: " + b);

        //this variable is used to define closest number to X
        double closest;

        closest = (abs((x - a)) < abs((x - b))) ? a : b;
        System.out.println("Ближайшее к " + x + " число: " + closest);
    }
}
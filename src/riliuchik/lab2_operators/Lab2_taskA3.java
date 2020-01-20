package src.riliuchik.lab2_operators;

//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//Создать программу, которая переставит числа в переменных таким образом,
//чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

public class Lab2_taskA3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 2;
        if (a < b && b < c && a < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b && a < b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < a && a < c && b < c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b < c && c < a && b < a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c < a && a < b && c < b) {
            System.out.println(c + " " + a + " " + b);
        } else {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
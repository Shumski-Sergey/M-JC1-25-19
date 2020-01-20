package src.riliuchik.lab2_operators;

//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

public class Lab2_taskA1 {
    public static void main(String[] args) {
        int x = 10;
        double m = 8.5;
        double n = 11.45;
        double int1 = Math.abs(x - m);
        double int2 = Math.abs(x - n);
        if (int1 < int2) {
            System.out.println("Число m=" + m + " ближе всего к " + x);
        } else if (int1 == int2) {
            System.out.println("Числа m=" + m + " и n=" + n + " одинаково удалены от " + x);
        } else {
            System.out.println("Число n=" + n + " ближе всего к " + x);
        }
    }
}
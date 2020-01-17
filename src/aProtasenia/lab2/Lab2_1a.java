package src.aProtasenia.lab2;

public class Lab2_1a {
    public static void main(String[] args) {
        double m = 8.5;
        double n = 11.45;
        int s = 10;
        double a = Math.abs(s - m);
        double b = Math.abs(s - n);
        if (a > b) {
            System.out.print(n);
        }
        if (a < b) {
            System.out.print(m);
        }

    }
}


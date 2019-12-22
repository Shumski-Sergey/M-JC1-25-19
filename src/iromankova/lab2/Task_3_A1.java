package iromankova.lab2;

public class Task_3_A1 {
    public static void main(String[] args) {
        double M = 8.5;
        double N = 11.45;
        double Num = 10;
        if (Math.abs(M-Num) > Math.abs(N-Num)) {
            System.out.println(N);
        }
        else System.out.println(M);
    }
}

package tmurashka.lab3;

public class lab3_A1 {
    public static void main(String[] args) {
        double m = 1;
        double n = 19;
        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.print("Ближе к 10 число: " + n);
        }
        else {
            System.out.print("Ближе к 10 число: " + m);
        }
    }
}

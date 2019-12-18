package dbesan.lab2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double m = 8.5;
        double n = 11.45;

        double x = (10 - m);
        double y = (10 - n);

        if (x < 0) {
            x = -x;

        } else if (y < 0) {
            y = -y;

        }
        if (x < y) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }

    }
}



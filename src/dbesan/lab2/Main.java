package dbesan.lab2;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double m = 8.5;
        double n = 11.45;
        double e = 10;
        double x = ((abs(e-n)) > (abs(e-m))) ? m : n;
        System.out.println(x);


    }
}



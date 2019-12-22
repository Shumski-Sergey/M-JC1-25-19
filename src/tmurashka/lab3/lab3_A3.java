package tmurashka.lab3;

public class lab3_A3 {
    public static void main(String[] args) {
        int a = -2;
        int b = 78;
        int c = 14;
        if (a > b && a > c && b > c) {
            System.out.println(c + " " + b + " " + a);
    }
        else if (a > b && a > c && c > b) {
        System.out.println(b + " " + c + " " + a);
    }
        else if (b > a && b > c && a > c) {
        System.out.println(c + " " + a + " " + b);
    }
        else if (b > a && b > c && c > a) {
        System.out.println(a + " " + c + " " + b);
    }
        else if (c > a && c > b && a > b) {
        System.out.println(b + " " + a + " " + c);
    }
        else if (c > a && c > b && b > a) {
        System.out.println(a + " " + b + " " + c);
    }


    }
}

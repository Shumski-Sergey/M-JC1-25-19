package d.grigirchik.lab3;

public class Task3 {

    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        int c = 2;
//вывод возростающего числа только при помощи if
        if ((a > b) && (b > c)) {
            System.out.println("c=" + c);
            System.out.println("b=" + b);
            System.out.println("a=" + a);
        }
        if ((a > c) && (c > b)) {
            System.out.println("b:" + b);
            System.out.println("c:" + c);
            System.out.println("a:" + a);
        }
        if ((b > a) && (a > c)) {
            System.out.println("c:" + c);
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        }
        if ((b > c) && (c > a)) {
            System.out.println("a:" + a);
            System.out.println("c:" + c);
            System.out.println("b:" + b);
        }
        if ((c > a) && (a > b)) {
            System.out.println("b:" + b);
            System.out.println("a:" + a);
            System.out.println("c:" + c);
        }
        if ((c > b) && (b > a)) {
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            System.out.println("c:" + c);
        }
    }
}

package aProtasenia.lab2;

public class Lab2_2a {
    public static void main(String[] args) {
        double a = -21.7;
        double b = 145.9;
        double c = -37.3;
        double x_1;
        double x_2;
        double x;
        if (-4 * a * c + b * b > 0) {
            x_1 = (-b + Math.sqrt(-4 * a * c + b * b)) / 2 * a;
            x_2 = (-b - Math.sqrt(-4 * a * c + b * b)) / 2 * a;
            System.out.println(x_1);
            System.out.print(x_2);
        }
        if (-4 * a * c + b * b == 0) {
            x = (-b) / (2 * a);
            System.out.println(x);
        }
        if (-4 * a * c + b * b < 0) {
            System.out.print("Нет вещественных корней");
        }
    }
}

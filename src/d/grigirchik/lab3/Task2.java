package d.grigirchik.lab3;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        int d;
        double root1;
        double root2;
        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        } else if (d == 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет один корень:" + root1);
        } else {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет два корня: " + "X1=" + root1 + " X2=" + root2);
        }
    }
}
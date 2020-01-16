package tabukara.lab2;

public class task1_2 {
    public static void main(String[] args) {
        double a = 8d;
        double b = 15d;
        double c = 10d;
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            double x = -b + Math.sqrt(d);
            double y = -b - Math.sqrt(d);
            System.out.println(x);
            System.out.println(y);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }
    }
}

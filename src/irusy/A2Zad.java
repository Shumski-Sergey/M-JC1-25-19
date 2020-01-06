package src.irusy;


public class A2Zad {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 4;
        int D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни:" + x1 + "" + x2);
        } else if (D == 0) {
            double x;
            x = -b / 2 * a;
            System.out.println("Корень:" + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}

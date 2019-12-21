package aantonovich;

public class Lesson2task2 {
    public static void main(String[] args) {
        double a = 3.5;
        double b = 2.2;
        double c = 0.27;
        double D = b*b - 4*a*c;
if (D == 0) {
    double Sqrt1 = (-b) / 2*a;
    System.out.println(Sqrt1);}
    else if (D > 0) {
        double Sqrt2 = (-b + Math.sqrt(D) / 2*a);
            double Sqrt3 = (-b - Math.sqrt(D) / 2*a);
            System.out.println(Sqrt2 +" " + "и" + " " + Sqrt3);}
    else { System.out.println("Корней нет");
        }
    }
}
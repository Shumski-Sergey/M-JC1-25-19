package riliuchik.lab2;

public class Lab2_taskA2 {
    public static void main(String[] args) {
        double a=1.1;
        double b=2.2;
        double c=0.3;
        double x1;
        double x2;
        double D=b*b-4*a*c;
        if (D>0) {
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Корни квадратного уравнения: x1="+x1+" и x2="+x2);
        }
        else if (D==0) {
            x1=(-b)/(2*a);
            System.out.println("Корень квадратного уравнения x="+x1);
        }
        else {
            System.out.println("Вещественных корней квадратного уравнения нет");
        }
    }
}
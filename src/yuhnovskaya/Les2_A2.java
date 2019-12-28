package yuhnovskaya;

public class Les2_A2 {
    public static void main(String[] args) {
        double A=4;
        double B=0;
        double C=-9;
        double D=(Math.pow(B,2)-4*A*C);
        double E=-C/A;
        if ((B==0 & E<0) | (D<0)) {System.out.println("корней нет");}
        else if((D==0) |  (B==0 & C==0)){double x=-B/2*A;
            System.out.println(x);}
        else if (B==0) {double x1=Math.sqrt(-C/A);
            double x2=-Math.sqrt(-C/A);
            System.out.println(x1);
            System.out.println(x2);}
        else {double x1=(-B+Math.sqrt(D))/2*A;
            double x2=(-B-Math.sqrt(D))/2*A;
            System.out.println(x1);
            System.out.println(x2);}
    }}


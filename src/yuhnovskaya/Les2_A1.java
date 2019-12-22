package yuhnovskaya;

public class Les2_A1 {
    public static void main(String[] args) {
        double m=9.5;
        double n=9.15;
        double x=Math.abs(10-m);
        double y=Math.abs(10-n);
        if (x<y)
        {System.out.println(m);}
        else if (x>y)
        {System.out.println(n);}
        else {System.out.println("равноудалены");}
    }
}

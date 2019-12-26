package a.mitsura;

public class Descriminant {
    public static void main(String [] args){
        int a=2, b=5, c=2, d;
        int x1, x2;
        d=b*b-4*a*c;
        if (d>0){
            x1=-b-Math.abs(d)/2*a;
            x2=-b+Math.abs(d)/2*a;
            System.out.println("x1 = "+x1+", x2 = "+x2);
        }else if (d==0){
            x1=-b/2*a;
            System.out.println("x= "+x1);
        }else{
            System.out.println("Нет корней");
        }
    }
}

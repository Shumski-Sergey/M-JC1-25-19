package yuhnovskaya;

public class Les2_A3 {
    public static void main(String[] args) {
        int A = 3;
        int B = 2;
        int C = 1;
        if ((A<B) & (B<C)) {System.out.println(A + " " + B + " " + C);}
        if ((A<C) & (C<B)) {System.out.println(A + " " + C + " " + B);}
        if ((A>B) & (A<C)) {System.out.println(B + " " + A + " " + C);}
        if ((C>B) & (C<A)) {System.out.println(B + " " + C + " " + A);}
        if ((C<A) & (A<B)) {System.out.println(C + " " + A + " " + B);}
        if ((C<B) & (B<A)) {System.out.println(C + " " + B + " " + A);}
    }
}

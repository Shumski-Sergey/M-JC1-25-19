package yuhnovskaya;

public class Les3_A3 {
    public static void main(String[] args) {
        long i = 7865779876753L;
        int j = 1000;
        float d = i % j;
        while (d * 10 > 0) {
            System.out.print(d + " ");
            j = j * 1000;
        }
    }
}

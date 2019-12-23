package yuhnovskaya;

public class Les3_A3 {
    public static void main(String[] args) {
        long a = 11111111111111L;
        int num = 0;
        for (long i = 1; a / i > 0; i = i * 10) {
            num = num + 1;}
            int k = num / 3;
            long j;
            if (num % 3 == 0) {
                j = k * 3 - 3;
            } else {
                j = j = k * 3;
            }
            while (j >= 0) {
                int b = (int) Math.floor(a / Math.pow(10, j));
                System.out.print(b + " ");
                a = (long) Math.floor(a % Math.pow(10, j));
                j = j - 3;
            }
        }}




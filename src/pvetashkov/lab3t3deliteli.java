package pvetashkov;
import java.util.Scanner;
public class lab3t3deliteli {
    public static void main(String[] args) {
        int d = 1;
        long n;
        System.out.println("enter num to find divider");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for (int i = 1; i < n; i++) {
        if (n % d== 0) {
        System.out.println(+d);}
            {d++;}
    }
}
}

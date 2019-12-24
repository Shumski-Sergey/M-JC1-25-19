package tmurashka.lab4;

import java.util.Scanner;

public class lab4_A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPositive = n >= 0;
        n = Math.abs(n);

        String str = "";
        int counter = 0;
        while (n > 0) {
            int c = n % 10;
            n /= 10;
            str += String.valueOf(c);
            if (++counter % 3 == 0 && n > 0) {
                str += ' ';
            }
        }

        if (!isPositive) {
            System.out.print('-');
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

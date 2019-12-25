package tmurashka.lab4;

import java.util.Scanner;

public class lab4_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("Число равно 1");
            return;
        }

        int sqrt = (int)Math.sqrt(n);
        boolean composite = false;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                composite = true;
                break;
            }
        }

        System.out.println(composite ? "Число составное" : "Число простое");
        }
    }

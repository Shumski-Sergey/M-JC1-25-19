package tmurashka.lab4;

public class lab4_A1 {
    public static void main(String[] args) {
        int n = 47;
        int buffer = n;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.print("Сумма цифр числа " + buffer + " равна " + sum);
    }
}
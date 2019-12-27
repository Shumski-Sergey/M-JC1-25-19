package src.aProtasenia.lab2;
//Имеется целое число. Следует посчитать сумму цифр данного числа.

public class Lab4_a1 {
    public static void main(String[] args) {
        int x = 111;
        int sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        } System.out.println("Сумма цифр данного числа: " + sum);
    }
}

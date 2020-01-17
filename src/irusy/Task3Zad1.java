package src.irusy;


public class Task3Zad1 {
    public static void main(String[] args) {
        int chislo = 5328;
        int x = chislo;
        int summa = 0;
        while (x != 0) {
            summa += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр в числе " + chislo + " = " + summa);
    }
}

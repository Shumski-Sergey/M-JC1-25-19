package aantonovich.Lesson3;

public class Lesson3task1 {
    public static void main(String[] args) {
        long  a = 388788517677474329L ; long b = a;
        long c = 0;
        while (b != 0) {
            c += b % 10;
            b /= 10;
        }
        System.out.println("Сумма цифр в числе " + a + " = " + c);}

}

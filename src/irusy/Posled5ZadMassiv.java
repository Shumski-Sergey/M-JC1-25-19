package src.irusy;

public class Posled5ZadMassiv {
    public static void main(String[] args) {
        int a = 2 , prevA;
        while (a < 10000){
            System.out.println(a);
            prevA = a;
            a = 2 * prevA - 1;
        }
    }

}

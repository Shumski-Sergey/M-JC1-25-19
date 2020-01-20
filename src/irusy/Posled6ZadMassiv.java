package src.irusy;

public class Posled6ZadMassiv {
    public static void main(String[] args) {
        int a = -166 , prevA;
        while (a < 100){
            if (a > 9 || (a > -100 && a < -9))
                System.out.println(a);
            prevA = a;
            a = 2 * prevA + 200;
        }
    }

}

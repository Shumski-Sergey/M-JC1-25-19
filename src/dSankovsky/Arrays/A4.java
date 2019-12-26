package dSankovsky.Arrays;

public class A4 {
    public static void main(String[] args) {
//вывести первые 20 чисел геометрической прогрессии с шагом в 2
        double n = 1;
        double q = 2;
        int second = 2;
        int first = second;
        while (n<=20) {
            second = (int) (first*Math.pow(q, n-1));
            System.out.println(second);
            n++;
        }
    }
}

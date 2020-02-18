package dSankovsky.Arrays;

public class A3 {
    public static void main(String[] args) {
//вывести числа от 90 до 0 с шагом в -5
        int n = 1;
        int d = -5;
        int second = 90;
        int first = second;
        while (second>0) {
            second = first + d * (n - 1);
            System.out.println(second);
            n++;
        }
    }

}

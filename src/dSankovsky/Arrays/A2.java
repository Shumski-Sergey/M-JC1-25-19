package dSankovsky.Arrays;

public class A2 {
    public static void main(String[] args) {
//вывести 55 чисел от 1  с шагом в 2
        int n = 1;
        int d = 2;
        int second = 1;
        int first = second;
        while (n <= 55) {
            second = first + d * (n - 1);
            System.out.println(second);
            n++;
        }
    }
}

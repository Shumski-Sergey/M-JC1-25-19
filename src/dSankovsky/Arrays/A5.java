package dSankovsky.Arrays;

public class A5 {
    public static void main(String[] args) {
        //вывести все члены последовательности 2А(n-1)-1, которые меньше 10 000, начиная с 2
        int second = 2;
        int first = second;
        while (true) {
            second = 2 * second - 1;
            if (second >= 10000)
                break;
            System.out.println(second);
        }
    }
}

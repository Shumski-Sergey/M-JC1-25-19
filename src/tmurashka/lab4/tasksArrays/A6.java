package tmurashka.lab4.tasksArrays;

public class A6 {
    public static void main(String[] args) {
        int a = -166;
        while (a < 100) {
            a = 2 * a -1 + 200;
            a++;
            if (a < -100 || a > 100) {
                continue;
            }
            System.out.println(a);
        }
    }
}

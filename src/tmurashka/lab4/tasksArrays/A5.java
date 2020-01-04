package tmurashka.lab4.tasksArrays;

public class A5 {
    public static void main(String[] args) {
        for (int i = 2; i < 10000; i = 2 * i - 1) {
            System.out.println(i);
        }
    }
}
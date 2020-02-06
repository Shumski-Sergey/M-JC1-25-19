package tabukara.lab2;

public class Task2_1 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * (155 + 5));
        if (i > 25 && i < 100) {
            System.out.println("The Random Variable i = " + i + " From the period of [5;155] entered the interval of (25:100)");
        } else {
            System.out.println("The Random Variable i = " + i + " From the period of [5;155] not entered the interval of (25:100)");
        }

    }
}

package KKropa.Lab_3;

public class Lesson_4_A2 {
    public static void main(String[] args) {
        int num = 14;
        int i = 1;
        int sum = 0;

        while (i <= num) {
            if (num % i == 0) {
                sum++;
            }
            i++;
        }
        if (sum == 2) {
            System.out.print("Число " + num + " простое.");
        }
        else {
            System.out.print("Число " + num + " составное.");
        }

    }
}

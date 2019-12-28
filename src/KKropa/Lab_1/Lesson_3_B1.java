package KKropa.Lab_1;

public class Lesson_3_B1 {
    public static void main(String[] args) {
        int min = 5;
        int max = 155;

        int randomNumber = min + (int) (Math.random() * max);
        if (randomNumber > 25 && randomNumber < 100) {
            System.out.println("Случано выбранное число " + randomNumber + " попало в интервал от 25 до 100.");
        } else {
            System.out.println("Случайно выбранное число " + randomNumber + " не попало в интервал от 25 до 100.");
        }

    }
}

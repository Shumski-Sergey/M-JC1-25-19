package KKropa.Lab_1;

public class Lesson_3_A1 {
    public static void main(String[] args) {

        double numberA = 8.5;
        double numberB = 11.45;
        double numberC = 10;

        double differenceA = numberC - numberA;
        double differenceB = numberC - numberB;

        if (Math.abs(differenceA) < Math.abs(differenceB)) {
            System.out.println(numberA);

        } else if (Math.abs(differenceA) > Math.abs(differenceB)) {
            System.out.println(numberB);
        }
    }

}

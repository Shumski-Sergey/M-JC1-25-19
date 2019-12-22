package KKropa.Lab_1;

public class Lesson_3_A3 {
    public static void main(String[] args) {
        int A = 42;
        int B = 91;
        int C = 2018;

        if ((A > B) && (A > C) && (B > C)) {
            System.out.println(C + ", " + B + ", " + A);
        } else if (A > B && A > C && B < C) {
            System.out.println(B + ", " + C + ", " + A);
        } else if (A < B && A < C && B < C) {
            System.out.println(A + ", " + B + ", " + C);
        } else if (A < B && A < C && B > C) {
            System.out.println(A + ", " + C + ", " + B);
        } else if (A < C && A > B && C > B) {
            System.out.println(B + ", " + A + ", " + C);
        } else if (B > A && B > C && C < A) {
            System.out.println(C + ", " + A + ", " + B);
        }

    }


}

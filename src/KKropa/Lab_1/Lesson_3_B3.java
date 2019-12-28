package KKropa.Lab_1;

import java.util.Scanner;

public class Lesson_3_B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = in.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


    }

}

package KKropa.Lab_3;

import java.util.Scanner;

public class Lesson_4_B2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num=in.nextInt();
        int i = 1;

        while (i<=num){
            if (num%i==0){
                if (i%2==0){
                    System.out.print(i + " ");
                }

            }i++;

        }



    }
}

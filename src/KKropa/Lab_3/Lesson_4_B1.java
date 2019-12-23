package KKropa.Lab_3;

import java.util.Scanner;

/**
 * Created by user on 21.12.2019.
 */
public class Lesson_4_B1 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число:");
        int num=in.nextInt();

        int newNum=1;
        int i=1;

        while (i<=num){
            newNum*=i;
            i++;
        }
        System.out.print(newNum);
    }
}

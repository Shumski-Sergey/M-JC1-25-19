package a.mitsura.Lesson2;

import java.util.Scanner;

public class Massiv7 {
    public static void main(String[] args){
        int n, m=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        if (sc.hasNextInt()){
            n = sc.nextInt();
            for ( int i = 1; i<=n; i++){
                m = m*i;
            }
            System.out.println(n+"факториал = "+m);}

        else
            System.out.println("Вы ввели не целое число ");
    }
}

package pvetashkov.lab5;//считает среднее арифметическое всех строк, и от него пляшет
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class lab5A3part2 {
    public static void main(String[] args) throws IOException {
        int n, a, b, c;
        String temp, sign;
        System.out.print("how many?_");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[n];
        System.out.print("Type your strings...");
        for (int i = 0; i < n; i++) {
            str[i] = bread.readLine();
            System.out.println(str[i] + " ");// вывод для меня. смотрю, работает ли.
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
            System.out.println(str[i] + " " + str[i].length() + "digits " + "_");
        }
        System.out.print("To see longer strings press 'L', to see shorter press 's' ");
        sign = sc.next();
        a=str[0].length();
        b=str[n-1].length();
        c=(a+b)/2;
        for (int i = 0; i < n; i++) {

            if (sign.equals("L")) {
                for ( i = 0; i < n; i++) {
                    if (str[i].length() > c) {
                        System.out.print(" length is " + str[i].length() + "for " + str[i]);
                    }
                }
            } else if (sign.equals("s")) {
                for ( i = 0; i < n; i++) {
                    if(str[i].length()<c){
                    System.out.println(" short length is " + str[i].length() + " in " + str[i]);}
                }
            }

        }
    }
}
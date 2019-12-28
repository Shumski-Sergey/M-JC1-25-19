package riliuchik.lab3;

import java.util.Scanner;

//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143.

public class Lab3_taskA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int input = in.nextInt();
        int mod = Math.abs(input);
        int n = 3;
        String output = "";
        while (mod != 0) {
            int digit = mod % 10;
            output = digit + output;
            n--;
            if (n == 0) {
                output = " " + output;
                n = 3;
            }
            mod /= 10;
        }
        if (input > 0) System.out.println("Число в бухгалтерском формате: " + output);
        else if (input < 0) System.out.println("Число в бухгалтерском формате: -" + output);
        else System.out.println("Вы ввели ноль");
    }
}
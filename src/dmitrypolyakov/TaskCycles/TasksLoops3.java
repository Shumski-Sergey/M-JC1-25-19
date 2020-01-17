package dmitrypolyakov.TaskCycles;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 15.01.2020
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class TasksLoops3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1000) {
            System.out.println(number);
        } else {
            NumberFormat f = NumberFormat.getInstance();
            System.out.println("В бухгалтерском учете число " + number + " выглядит как:  " + f.format(number));
        }
    }
}
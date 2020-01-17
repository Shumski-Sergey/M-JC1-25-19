package dmitrypolyakov.TaskCycles;

/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 05.01.2020
 */

import java.util.Scanner;

public class TasksLoops2 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}

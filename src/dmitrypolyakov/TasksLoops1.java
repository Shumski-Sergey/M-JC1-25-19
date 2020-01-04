package dmitrypolyakov;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 27.12.2019
 */

import java.util.Scanner;

public class TasksLoops1 {
    public static void main(String[] args) {
        Scanner outData = new Scanner(System.in);
        int summa = 0;
        System.out.println("Введите любое целое положительное число: ");
        String data = outData.nextLine();
        char[] symbol = data.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            summa = summa + Character.getNumericValue(symbol[i]);
        }
        System.out.print("Сумма чисел из числа " + data + " равна " + summa + ";");
    }
}


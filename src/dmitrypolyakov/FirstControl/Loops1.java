package dmitrypolyakov.FirstControl;
/**
 * Java courses
 *
 * @author Dmitry Polyakov (M-JC1-25-19)
 * @version dated 31.01.2020
 *
 * В данной строке найти количество цифр. Вывести количество и сумму цифр
 */

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Вызываем сканер
        int summa = 0, count = 0;//Создаем переменные и задаем началиный параметр = 0
        System.out.println("Введите любое целое положительное число: ");//Вводим число
        String sum = sc.nextLine();//Присваиваем значение
        char[] symbol = sum.toCharArray();
        for (int i = 0; i < symbol.length; i++) {//Создаем цикл с переменной для подсчета суммы цифр
            summa = summa + Character.getNumericValue(symbol[i]);
        }
        for (int j = 0; j < sum.length(); j++) {//Создаем цикл с переменной для подсчета количества цифр
            if (Character.isDigit(sum.charAt(j))) {
                count++;
            }
        }
        System.out.println("Количество цифр введенного числа равно " + count);
        System.out.print("Сумма цифр из числа " + sum + " равна " + summa + ";");
    }
}

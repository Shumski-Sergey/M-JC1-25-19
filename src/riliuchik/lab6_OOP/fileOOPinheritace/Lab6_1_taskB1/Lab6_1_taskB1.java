package riliuchik.lab6_OOP.fileOOPinheritace.Lab6_1_taskB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями:
//типа long для рублей и типа char - для копеек. Дробная часть (копейки) при выводе на экран
//должна быть отделена от целой части запятой.
//Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
//умножение на дробное число и операции сравнения. В функции main проверить эти методы.

public class Lab6_1_taskB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число с двумя знаками после точки: ");
        String money1 = in.readLine();
        System.out.print("Введите второе число с двумя знаками после точки: ");
        String money2 = in.readLine();
        System.out.print("Введите дробное число с двумя знаками после точки: ");
        String number = in.readLine();
        Money mn1 = new Money((long) Double.parseDouble(money1), getKopeks(money1));
        Money mn2 = new Money((long) Double.parseDouble(money2), getKopeks(money2));
        Money num = new Money((long) Double.parseDouble(number), getKopeks(number));
        addition(mn1, mn2);
        subtraction(mn1, mn2);
        System.out.print("Частное от деления: ");
        division(mn1, mn2);
        System.out.print("Частное от деления первого числа на дробное число: ");
        division(mn1, num);
        System.out.print("Частное от деления второго числа на дробное число: ");
        division(mn2, num);
        System.out.print("Произведение первого числа на дробное число: ");
        multiplication(mn1, num);
        System.out.print("Произведение второго числа на дробное число: ");
        multiplication(mn2, num);
        comparison(mn1, mn2);
        comparison(mn1, num);
        comparison(mn2, num);
    }

    public static char[] getKopeks(String money) {
        String[] arr = money.split("\\.");
        if (arr.length > 1 && arr[1].length() > 1) {
            char[] temp = arr[1].toCharArray();
            char[] result = new char[2];
            for (int i = 0; i < 2; i++) {
                result[i] = temp[i];
            }
            return result;
        } else {
            return new char[]{'0', '0'};
        }
    }

    public static void addition(Money a, Money b) {
        double temp1 = Double.parseDouble((a.getRubles()) + "." + String.valueOf(a.getKopeks()));
        double temp2 = Double.parseDouble((b.getRubles()) + "." + String.valueOf(b.getKopeks()));
        double temp_result = temp1 + temp2;
        Money result = new Money((long) temp_result, getKopeks(String.valueOf(temp_result)));
        System.out.println("Сумма: " + result);
    }

    public static void subtraction(Money a, Money b) {
        double temp1 = Double.parseDouble((a.getRubles()) + "." + String.valueOf(a.getKopeks()));
        double temp2 = Double.parseDouble((b.getRubles()) + "." + String.valueOf(b.getKopeks()));
        double temp_result = temp1 - temp2;
        Money result = new Money((long) temp_result, getKopeks(String.valueOf(temp_result)));
        if (temp_result < 0 && temp_result > -1) System.out.println("Разность: -" + result);
        else System.out.println("Разность: " + result);
    }

    public static void division(Money a, Money b) {
        double temp1 = Double.parseDouble((a.getRubles()) + "." + String.valueOf(a.getKopeks()));
        double temp2 = Double.parseDouble((b.getRubles()) + "." + String.valueOf(b.getKopeks()));
        double temp_result = temp1 / temp2;
        Money result = new Money((long) temp_result, getKopeks(String.valueOf(temp_result)));
        System.out.println(result);
    }

    public static void multiplication(Money a, Money b) {
        double temp1 = Double.parseDouble((a.getRubles()) + "." + String.valueOf(a.getKopeks()));
        double temp2 = Double.parseDouble((b.getRubles()) + "." + String.valueOf(b.getKopeks()));
        double temp_result = temp1 * temp2;
        Money result = new Money((long) temp_result, getKopeks(String.valueOf(temp_result)));
        System.out.println(result);
    }

    public static void comparison(Money a, Money b) {
        double temp1 = Double.parseDouble((a.getRubles()) + "." + String.valueOf(a.getKopeks()));
        double temp2 = Double.parseDouble((b.getRubles()) + "." + String.valueOf(b.getKopeks()));
        Money result1 = new Money((long) temp1, getKopeks(String.valueOf(temp1)));
        Money result2 = new Money((long) temp2, getKopeks(String.valueOf(temp2)));
        if (temp1 < temp2) System.out.println(result1 + "<" + result2);
        else if (temp1 > temp2) System.out.println(result1 + ">" + result2);
        else System.out.println(result1 + "=" + result2);
    }
}
package dSankovsky.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String first = reader.readLine();
        int numb = Integer.parseInt(first);     //по сути число 1936 можно представить как 1*10^3+9*10^2+3^10^1+6*10^0
        int compNumb = 1;
        int mulNumb = 1;    //переменная, которая поможет узнать количество разрядов числа

        while (compNumb < numb) {    //каждое умножение на 10 - добавление одного разряда числа
            compNumb = compNumb * 10;
            mulNumb++;
        }

        int newNumb, sum = 0;    //newNum - промежуточная переменная, содержащая остаток от деления на 10, то есть значение последнего разряда
        for (int i = 1; i <= mulNumb; i++) {
            newNumb = numb % 10;    //находим значение левого разряда
            sum += newNumb;  //суммируем
            numb = (numb - newNumb) / 10;   //отбрасываем крайний левый разряд
        }
        System.out.println("Сумма цифр = " + sum);


    }
}

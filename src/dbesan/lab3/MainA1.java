package dbesan.lab3;

import java.io.*;

public class MainA1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Подсчет суммы цифр числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String b = reader.readLine(); //читаем строку с клавиатуры
        int result = 0;//это будет результат
        for (char character : b.toCharArray()) //создаем из строки массив чаров. двуеточие - for each
        {
            result += Integer.valueOf(Character.toString(character)); // считаем сумму valueof - возвращает из строки число. Character.toString - делает строку из чара - число разбивается на чары for each условием
        }
        System.out.println("Сумма цифр числа составляет: " + result);

    }
}

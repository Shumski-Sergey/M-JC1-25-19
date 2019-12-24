package dbesan.lab3;

import java.io.*;

public class MainB2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Считаем количество делителей числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i <= a; i++) {
            int d = a % i; //если число делится на i без остатка, то это наш делитель. i - числа от нуля +1 каждую итерацию
            if (d == 0) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("Общее количество: " + count);

    }
}

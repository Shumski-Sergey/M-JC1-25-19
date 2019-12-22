package dbesan.lab3;

import java.io.*;
import java.util.*;

public class MainA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        int tempb = 1; //временная Считаем количество трехзначных блоков
        int count = 0; //Считаем количество трехзначных блоков
        for (int i = 0; tempb < a; i++) {
            tempb = tempb * 1000;
            count++;
        }
        int[] bankarray;
        bankarray = new int[count];
        int kysok;
        for (int i = 1; i <= count; i++) {
            kysok = a % 1000;
            bankarray[i - 1] = kysok;
            a = (a - kysok) / 1000;
        }
        for (int  i = count - 1; i >= 0; i--)
        {
            System.out.print(bankarray[i] + " ");
        }
        }
    }

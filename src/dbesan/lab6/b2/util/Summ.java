package dbesan.lab6.b2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.valueOf;

public class Summ {
    private long rubles;
    private int penny;
    long secondrub;
    char secondchar;

    public Summ(long rubles, int penny) throws IOException {
        this.rubles = rubles;
        this.penny = penny;
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сколько рублей хотите добавить");
        secondrub = Integer.parseInt(reader2.readLine());;
        long summrub = rubles + secondrub;
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сколько копеек хотите добавить");
         char secondcharz = (char) Integer.parseInt(reader3.readLine());
         secondchar = valueOf(secondcharz);
        int summpenny =  (penny + secondchar);
        System.out.println(summrub+"," + summpenny);

    }
    }








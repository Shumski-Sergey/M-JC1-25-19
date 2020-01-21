package dbesan.lab6.b2.util;

import dbesan.lab6.b2.Start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.valueOf;

public class Sub {

    private long secondrub;
    private char secondchar;

    public Sub(long rubles) throws IOException {
        rubles = Start.getRubles();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сколько рублей хотите отнять");
        secondrub = Integer.parseInt(reader2.readLine());

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сколько копеек хотите отнять");
        char secondcharz = (char) Integer.parseInt(reader3.readLine());
        long secondchar = valueOf(secondcharz);
        long sub = rubles - ((secondrub * InputMoney.PENNY_VALUE) + secondchar); //сумма в long
        new OutputMoney(sub);
    }


}









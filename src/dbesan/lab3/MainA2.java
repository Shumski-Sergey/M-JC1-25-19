package dbesan.lab3;

import java.io.*;

/**
 * Created by user on 21.12.2019.
 */
public class MainA2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
if ((a%2 == 0) || (a%3 == 0) || (a%4 == 0) || (a%5 == 0) || (a%6 == 0) || (a%7 == 0) || (a%8 == 0) || (a%9 == 0))
{System.out.println("Не простое");}
else
{System.out.println("Простое");}
    }
}

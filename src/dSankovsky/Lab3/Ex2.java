package dSankovsky.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb;
        do {
            System.out.println("Введите натуральное число");
            String first = reader.readLine();
            numb = Integer.parseInt(first);
        }
        while (numb <= 0);

        for (int i = 1; i <= numb; i++) {    //прогоняются все числа от 1 до введенного
            if (numb % i == 0 && i != numb && i != 1) {  //если число кратно числу, не равному 1 или введенному, то оно не является простым
                System.out.println("Число не является простым");
                break;
            }
            if (i == numb)
                System.out.println("Число простое");
        }
    }
}

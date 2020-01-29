package dbesan.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа, нажимая после каждого Enter");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int[] myArrayInt = {a, b, c};
        Arrays.sort(myArrayInt);
        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + " ");
        }


    }
}




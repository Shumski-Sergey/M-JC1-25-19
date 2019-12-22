package dbesan.lab3;

import java.io.*;

public class MainB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i <= a; i++) {
            int d = a % i;
            if (d == 0) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("Общее количество: " + count);

    }
}

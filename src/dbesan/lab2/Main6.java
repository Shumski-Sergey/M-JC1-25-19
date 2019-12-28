package dbesan.lab2;

import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());
        int x = 0;
      for (int i = 1; i<=a; i++)
      { x = x+i;
          }
        System.out.print(x);




    }
}




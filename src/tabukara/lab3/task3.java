package tabukara.lab3;


import java.io.IOException;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String BF = in.next();
        for (int i = 0; i < BF.length(); i++) {
            if ((BF.length() - i) % 3 == 0)
                System.out.print(" ");
            System.out.print(BF.charAt(i));
        }

    }

}
package d.grigirchik.lab4;

import java.util.Scanner;

public class Task3A {
    public static void main(String[] args) {
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please number with 7 or more digits");
        while (!scanner.hasNextLong()) {
            System.out.println("Sorry, you enter not a number. Please try again");
            scanner.next();
        }
        number = scanner.next();
        System.out.print("It is your number:");
        for (int i = 0; i < number.length(); i++) {
            if ((number.length() - i) % 3 == 0) {
                System.out.print(" ");
            }
            System.out.print(number.charAt(i));
        }
    }
}

package d.grigirchik.lab4;

import java.util.Scanner;

public class Task1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int factorial=1;
        System.out.println("Hello user! Please enter a number");
        while (!scanner.hasNextInt()) {
            System.out.println("Sorry, you enter not a number. Please try again");
            scanner.next();
        }
        number = scanner.nextInt();
        System.out.println("You enter a number: "+ number);
        for (int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println("Your namber factorial: "+ factorial);
    }
}

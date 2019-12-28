package d.grigirchik.lab4;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Hello user! Please enter a number");
        while (!scanner.hasNextInt()) {
            System.out.println("Sorry, you enter not a number. Please try again");
            scanner.next();
        }
        number = scanner.nextInt();
        System.out.println("Your number can be divided without a remainder into these numbers:");
        for (int i=1; i<=number; i++){
            if (number%i==0){
                System.out.println("number " +i);
            }
        }
    }
}
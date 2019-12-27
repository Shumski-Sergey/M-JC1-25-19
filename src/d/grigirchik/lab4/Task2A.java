package d.grigirchik.lab4;

import java.util.Scanner;

public class Task2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter=0;
        System.out.println("Hello user! Please enter a number");
        while (!scanner.hasNextInt()) {
            System.out.println("Sorry, you enter not a number. Please try again");
            scanner.next();
        }
        number = scanner.nextInt();
        System.out.println("You enter: " + number);
        for (int i =1; i <= number; i++) {
            int flag;
            flag = number % (i);
            if (flag == 0) {
                counter=counter+1;
            }
        }
        if (counter>2){
            System.out.println("This number: "+number+" isn't prime");
        }
        else {
            System.out.println("This number: "+number+" is prime");
        }
    }
}

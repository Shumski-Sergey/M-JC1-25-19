package d.grigirchik.lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int number;
 int sum=0;
        System.out.println("Hello! Enter please a number");
        while (!scanner.hasNextInt()){
            System.out.println("Sorry, you enter a not number. Please try again.");
            scanner.next();
        }
        number=scanner.nextInt();
        System.out.println("Thanks. You enter number: "+ number);
        for (int i=0; i<=number; i++){
            sum=sum+i;
        }
        System.out.println("It is your sum: "+sum);
    }
}

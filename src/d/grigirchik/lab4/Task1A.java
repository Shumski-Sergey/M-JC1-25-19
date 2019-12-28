package d.grigirchik.lab4;

import java.util.Scanner;

public class Task1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum=0;
        System.out.println("Hello user. Enter please a number");
        while (!scanner.hasNextInt()){
            System.out.println("Sorry, you enter not a number. Please try again");
            scanner.next();
        }
        number=scanner.nextInt();
        for (int i=0; i<=number; i++){
            sum=sum+i;
        }
        System.out.println("It is your sum: "+sum);
    }
}

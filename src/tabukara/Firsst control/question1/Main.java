package question1;

import java.util.ArrayList;
import java.util.Scanner;
//not ready
public class Main {
    public static  void main (String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> dj = new ArrayList<>();

        for (int i=0;i<=3;i++){
            System.out.print("Enter the Quantity of digits: ");
            dj.add(sc.nextInt());
        }

        int sum = 0;
        for (int i = 0 ; i < dj.size(); i++){
            sum += dj.get(i);
        }
        System.out.print("the digits are:  " + dj);
        System.out.print("\n The quantity of numbers is: " + dj.size());
        System.out.print(" \n The sum of the numbers is : " + sum);


    }
}
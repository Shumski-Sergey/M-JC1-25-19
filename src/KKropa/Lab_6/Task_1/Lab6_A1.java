package KKropa.Lab_6.Task_1;

import java.util.Scanner;

public class Lab6_A1 {
    public static void main (String [] args){
        Large_Appliances refragerator = new Large_Appliances("Refragerator", "Bosch");
        Large_Appliances washer = new Large_Appliances("Washer", "Electrolux");
        Small_Appliances iron = new Small_Appliances("Iron", "Philips");
        Small_Appliances electricKittle = new Small_Appliances("Electric kittle", "Philips");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what you want to plug in. " +
                "Write 1 of 4 numbers: 1. refragerator; 2. washer; 3. iron; 4. electric kittle.");
        int number = scanner.nextInt();


        if (number == 1){
            System.out.println(refragerator.getType() + " " + refragerator.getBrand() + " " + "is plugged in. ");
        } else if (number == 2){
            System.out.println(washer.getType()+ " " + washer.getBrand()+ " " + "is plugged in.");
        } else if (number == 3) {
            System.out.println(iron.getType() + " " + iron.getBrand() + " " + "is plugged in.");
        }else if (number == 4) {
            System.out.println(electricKittle.getType() + " " + electricKittle.getBrand() + " " + "is plugged in.");
        }
    }
}

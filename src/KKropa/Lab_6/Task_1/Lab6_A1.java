package KKropa.Lab_6.Task_1;

import java.util.Scanner;

public class Lab6_A1 {
    public static void main (String [] args){
        Refrigerator refrigerator = new Refrigerator("Refrigerator", "Bosch", 41, "A+", 366, "full no frost" );
        Washer wash = new Washer("Washer", "Elecrolux", 76, "A++", "front loading", 6);
        Iron iron = new Iron("Iron", "Phillips", 2800, 2.5, "2", "with steam humidification");
        ElectricKittle kittle = new ElectricKittle("Electric kittle", "Phillips", 1800, 0.75, 1.5,"closed");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what you want to plug in. " +
                "Write 1 of 4 numbers: 1. refragerator; 2. washer; 3. iron; 4. electric kittle.");
        int number = scanner.nextInt();


        if (number == 1){
            System.out.println(refrigerator.getType() + " " + refrigerator.getBrand() + " " + "is plugged in. " + "Main functions: " + "noise level - " + refrigerator.getNoiseLevel() + ", energy efficiency - " + refrigerator.getEnergyEfficiency() + ", capacity - " + refrigerator.getСapacity() + " liters, " + "cooling system - " + refrigerator.getCoolingSystem()+".");
        } else if (number == 2){
            System.out.println(wash.getType() + " " + wash.getBrand() + " " + "is plugged in. " + "Main functions: " + "noise level - " + wash.getNoiseLevel() + ", energy efficiency - " + wash.getEnergyEfficiency() + ", loading laundery - " + wash.getLoadingLaundry() + ", maximum load - " + wash.getMaximumLoad()+" kilo.");
        } else if (number == 3) {
            System.out.println(iron.getType() + " " + iron.getBrand() + " " + "is plugged in. " + "Main functions: " + "power - " + iron.getPower() + " watt, power cord length - " + iron.getPowerCordLength() + " meters, heating time - " + iron.getHeatingTime() + " minutes, type - " + iron.getIronsType()+".");
        }else if (number == 4) {
            System.out.println(kittle.getType() + " " + kittle.getBrand() + " " + "is plugged in. " + "Main functions: " + "power - " + kittle.getPower() + " watt, power cord length - " + kittle.getPowerCordLength() + " meters, volume - " + kittle.getVolume() + " litres, heating elements - " + kittle.getHeatingElement()+".");
        }
    }
}

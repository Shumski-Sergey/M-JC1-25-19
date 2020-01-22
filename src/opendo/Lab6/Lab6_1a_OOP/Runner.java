package Lab6_1a_OOP;
import java.util.Scanner;
//Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select appliances to plug into the outlet: coffeemaker(1), coffee machine(2), cordless vacuum cleaner(3) or robot vacuum cleaner(4)?");
        int s = scan.nextInt();

        CoffeeMaker coffeeMaker = new CoffeeMaker("Horn pump coffeemaker", "Polaris PCM 1535E Adore Cappuccino",
                2017, 600, 15, "ground", "horn pump", false);
        CoffeeMachine coffeeMachine = new CoffeeMachine("Espresso coffee machine", "DeLonghi ECAM 25.462.B",
                2018, 1450, 15, "ground, grain", "coffeemachine", true);
        CordlessVacuumCleaner cordlessVacuumCleaner = new CordlessVacuumCleaner("Vacuum cleaner", "Samsung VS80N8014KR/EV",
                2018, 450, 82, 0.35, 1600, 40, "HEPA", "vertical 2-in-1");
        RobotVacuumCleaner robotVacuumCleaner=new RobotVacuumCleaner("Robot vacuum cleaner", "Xiaomi Mijia Sweeping Robot STYTJ02YM ",
                2019, 33, 60, 0.5, 2600, 200, true, true);
        if (s==1) {
            System.out.println(coffeeMaker.getCategoryName() + " " + coffeeMaker.getBrand() + ", " + coffeeMaker.getYearOfIssue() + " is plugged in.");
        }
        else if (s==2) {
            System.out.println(coffeeMachine.getCategoryName() + " " + coffeeMachine.getBrand() + ", " + coffeeMachine.getYearOfIssue() + " is plugged in.");
            }
        else if (s==3) {
            System.out.println(cordlessVacuumCleaner.getCategoryName() + " " + cordlessVacuumCleaner.getBrand() + ", " + cordlessVacuumCleaner.getYearOfIssue() + " is plugged in.");
            }
        else {
            System.out.println(robotVacuumCleaner.getCategoryName() + " " + robotVacuumCleaner.getBrand() + ", " + robotVacuumCleaner.getYearOfIssue() + " is plugged in.");
           }
    }
}

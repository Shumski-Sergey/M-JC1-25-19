package riliuchik.lab6_inheritance.taskA1;

//Создать иерархию классов, описывающих бытовую технику.
//Создать несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Lab6_taskA1 {
    public static void main(String[] args) {
        KitchenType refrigerator = new KitchenType("Холодильник", "Smeg", true, true);
        KitchenType microwave = new KitchenType("Микроволновка", "Bosch", false, true);
        Home vacuum = new Home("Пылесос", "Karcher", false);

        System.out.println(refrigerator.getName() + " " + refrigerator.getBrand());
        refrigerator.type();
        refrigerator.subtype();
        refrigerator.size();
        System.out.println("");
        refrigerator.status();

        System.out.println("\n");
        System.out.println(microwave.getName() + " " + microwave.getBrand());
        microwave.type();
        microwave.subtype();
        microwave.size();
        System.out.println("");
        microwave.status();

        System.out.println("\n");
        System.out.println(vacuum.getName() + " " + vacuum.getBrand());
        vacuum.type();
        vacuum.subtype();
        System.out.println("");
        vacuum.status();
    }
}
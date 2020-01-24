package iromankova.lab7OOP;

import iromankova.lab7OOP.servise.Info;

public class Ovens extends KitchenAppliances implements Info {
    public Ovens(String name, String shortDescription, int numberOfCavities) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.numberOfCavities = numberOfCavities;
    }


    @Override
    public void showInfo() {
        System.out.println("Description: " + name + " (" + shortDescription + ", number of cavities - "
                + numberOfCavities + ").");
    }
}

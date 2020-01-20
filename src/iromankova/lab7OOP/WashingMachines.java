package iromankova.lab7OOP;

import iromankova.lab7OOP.servise.Info;

public class WashingMachines extends LaundryAppliances implements Info {
    public WashingMachines(String name, String shortDescription, String tapeOfInstallation) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.tapeOfInstallation = tapeOfInstallation;
    }


    @Override
    public void showInfo() {
        System.out.println("Description: " + name + " (" + shortDescription + ", type of installation - "
                + tapeOfInstallation + ").");
    }
}

package dSankovsky.Inheritance.Technic;

public class Smartphone extends PortableTechnic {
    private String OS;
    private double displaySize;

    public Smartphone(String model, String color, String material, int weight, int battery, String OS, double displaySize) {
        this.setModel(model);
        this.setColor(color);
        this.setMaterial(material);
        this.setWeight(weight);
        this.setBattery(battery);
        this.OS = OS;
        this.displaySize = displaySize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }


}

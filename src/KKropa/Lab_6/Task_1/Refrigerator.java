package KKropa.Lab_6.Task_1;

public class Refrigerator extends Large_Appliances {
    private int сapacity;
    private String coolingSystem;

    public Refrigerator(String type, String brand, int noiseLevel, String energyEfficiency, int сapacity, String coolingSystem) {
        super(type, brand, noiseLevel, energyEfficiency);
        this.сapacity = сapacity;
        this.coolingSystem = coolingSystem;
    }

    public int getСapacity() {
        return сapacity;
    }

    public void setСapacity(int сapacity) {
        this.сapacity = сapacity;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }


}

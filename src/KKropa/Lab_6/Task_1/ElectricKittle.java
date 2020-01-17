package KKropa.Lab_6.Task_1;

public class ElectricKittle extends Small_Appliances {

    private double volume;
    private String heatingElement;

    public ElectricKittle(String type, String brand, int power, double powerCordLength, double volume, String heatingElement) {
        super(type, brand, power, powerCordLength);
        this.volume = volume;
        this.heatingElement = heatingElement;
    }

    public double getVolume() { return volume; }

    public void setVolume(double volume) { this.volume = volume; }

    public String getHeatingElement() { return heatingElement; }

    public void setHeatingElement(String heatingElement) { this.heatingElement = heatingElement; }
}

package KKropa.Lab_6.Task_1;

public class Small_Appliances extends Appliances {

    public int power;
    public double powerCordLength;

    public Small_Appliances(String type, String brand, int power, double powerCordLength) {
        super(type, brand);
        this.power = power;
        this.powerCordLength = powerCordLength;
    }

    public int getPower() { return power; }

    public void setPower(int power) { this.power = power; }

    public double getPowerCordLength() { return powerCordLength; }

    public void setPowerCordLength(int powerCordLength) { this.powerCordLength = powerCordLength; }
}

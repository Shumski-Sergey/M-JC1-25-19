package KKropa.Lab_6.Task_1;

public class Small_Appliances extends Appliances {

    public int power;
    public int powerCordLength;

    public Small_Appliances(String type, String brand) {
        super(type, brand);
    }



    public int getPower() { return power; }

    public void setPower(int power) { this.power = power; }

    public int getPowerCordLength() { return powerCordLength; }

    public void setPowerCordLength(int powerCordLength) { this.powerCordLength = powerCordLength; }
}

package KKropa.Lab_6.Task_1;

public class Iron extends Small_Appliances {

    private String heatingTime;
    private String ironsType;

    public Iron(String type, String brand, int power, double powerCordLength, String heatingTime, String ironsType) {
        super(type, brand, power, powerCordLength);
        this.heatingTime = heatingTime;
        this.ironsType = ironsType;
    }

    public String getHeatingTime() { return heatingTime; }

    public void setHeatingTime(String heatingTime) { this.heatingTime = heatingTime; }

    public String getIronsType() { return ironsType; }

    public void setIronsType(String ironsType) { this.ironsType = ironsType; }
}

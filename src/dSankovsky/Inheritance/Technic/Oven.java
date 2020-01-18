package dSankovsky.Inheritance.Technic;

public class Oven extends OversizeTechnic {

    private int maxTemperature;
    private boolean convectionMode;

    public Oven(String model,String color, String material, boolean powerOutlet, int maxTemperature, boolean convectionMode){
        this.setModel(model);
        this.setColor(color);
        this.setMaterial(material);
        this.setPowerOutlet(powerOutlet);
        this.maxTemperature=maxTemperature;
        this.convectionMode=convectionMode;
    }
    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public boolean getConvectionMode() {
        return convectionMode;
    }

    public void setConvectionMode(boolean convectionMode) {
        this.convectionMode = convectionMode;
    }
}

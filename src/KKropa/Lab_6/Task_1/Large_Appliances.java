package KKropa.Lab_6.Task_1;

public class Large_Appliances extends Appliances {

    public int noiseLevel;
    public String energyEfficiency;

    public Large_Appliances(String type, String brand, int noiseLevel, String energyEfficiency) {
        super(type, brand);
        this.noiseLevel = noiseLevel;
        this.energyEfficiency = energyEfficiency;
    }

    public int getNoiseLevel() { return noiseLevel; }

    public String getEnergyEfficiency() { return energyEfficiency; }

    public void setNoiseLevel(int noiseLevel) { this.noiseLevel = noiseLevel; }

    public void setEnergyEfficiency(String energyEfficiency) { this.energyEfficiency = energyEfficiency; }
}

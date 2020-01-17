package KKropa.Lab_6.Task_1;

public class Large_Appliances extends Appliances {

    public int noiseLevel;
    public int energyEfficiency;

    public Large_Appliances(String type, String brand) {
        super(type, brand);
    }

    public int getNoiseLevel() { return noiseLevel; }

    public int getEnergyEfficiency() { return energyEfficiency; }

    public void setNoiseLevel(int noiseLevel) { this.noiseLevel = noiseLevel; }

    public void setEnergyEfficiency(int energyEfficiency) { this.energyEfficiency = energyEfficiency; }
}

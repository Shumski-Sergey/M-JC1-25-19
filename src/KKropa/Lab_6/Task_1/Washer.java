package KKropa.Lab_6.Task_1;

public class Washer extends Large_Appliances {
     private String loadingLaundry;
     private double maximumLoad;

    public Washer(String type, String brand, int noiseLevel, String energyEfficiency, String loadingLaundry, double maximumLoad) {
        super(type, brand, noiseLevel, energyEfficiency);
        this.loadingLaundry = loadingLaundry;
        this.maximumLoad = maximumLoad;
    }

    public String getLoadingLaundry() { return loadingLaundry; }

    public void setLoadingLaundry(String loadingLaundry) { this.loadingLaundry = loadingLaundry; }

    public double getMaximumLoad() { return maximumLoad; }

    public void setMaximumLoad(double maximumLoad) { this.maximumLoad = maximumLoad; }
}

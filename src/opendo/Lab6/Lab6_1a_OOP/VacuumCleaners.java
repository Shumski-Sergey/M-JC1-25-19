package Lab6_1a_OOP;

public class VacuumCleaners extends Appliances {
    int noiseLevel;
    double dustCollectorVolume;
    int batteryCapacity;
    int cleaningTime;

    public VacuumCleaners(String categoryName, String brand, int yearOfIssue, int power, int noiseLevel, double dustCollectorVolume, int batteryCapacity, int cleaningTime) {
        super(categoryName, brand, yearOfIssue, power);
        this.noiseLevel = noiseLevel;
        this.dustCollectorVolume = dustCollectorVolume;
        this.batteryCapacity = batteryCapacity;
        this.cleaningTime = cleaningTime;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public double getDustCollectorVolume() {
        return dustCollectorVolume;
    }

    public void setDustCollectorVolume(double dustCollectorVolume) {
        this.dustCollectorVolume = dustCollectorVolume;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCleaningTime() {
        return cleaningTime;
    }

    public void setCleaningTime(int cleaningTime) {
        this.cleaningTime = cleaningTime;
    }
}

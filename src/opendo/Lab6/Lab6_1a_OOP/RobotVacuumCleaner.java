package Lab6_1a_OOP;

public class RobotVacuumCleaner extends VacuumCleaners {
    private boolean wetCleaning;
    private boolean sideBrush;

    public RobotVacuumCleaner(String categoryName, String brand, int yearOfIssue, int power, int noiseLevel, double dustCollectorVolume, int batteryCapacity, int cleaningTime, boolean wetCleaning, boolean sideBrush) {
        super(categoryName, brand, yearOfIssue, power, noiseLevel, dustCollectorVolume, batteryCapacity, cleaningTime);
        this.wetCleaning = wetCleaning;
        this.sideBrush = sideBrush;
    }

    public boolean isWetCleaning() {
        return wetCleaning;
    }

    public void setWetCleaning(boolean wetCleaning) {
        this.wetCleaning = wetCleaning;
    }

    public boolean isSideBrush() {
        return sideBrush;
    }

    public void setSideBrush(boolean sideBrush) {
        this.sideBrush = sideBrush;
    }
}

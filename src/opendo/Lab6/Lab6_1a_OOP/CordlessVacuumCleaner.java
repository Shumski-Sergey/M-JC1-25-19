package Lab6_1a_OOP;

public class CordlessVacuumCleaner extends VacuumCleaners {
private String fineFilter;
private String type;

    public CordlessVacuumCleaner(String categoryName, String brand, int yearOfIssue, int power, int noiseLevel, double dustCollectorVolume, int batteryCapacity, int cleaningTime, String fineFilter, String type) {
        super(categoryName, brand, yearOfIssue, power, noiseLevel, dustCollectorVolume, batteryCapacity, cleaningTime);
        this.fineFilter = fineFilter;
        this.type = type;
    }

    public String getFineFilter() {
        return fineFilter;
    }

    public void setFineFilter(String fineFilter) {
        this.fineFilter = fineFilter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

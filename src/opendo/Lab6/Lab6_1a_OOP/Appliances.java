package Lab6_1a_OOP;

public class Appliances {
    private String categoryName;
    private String brand;
    private int yearOfIssue;
    private int power;

    public Appliances(String categoryName, String brand, int yearOfIssue, int power) { //constructor
        this.categoryName = categoryName;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.power = power;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

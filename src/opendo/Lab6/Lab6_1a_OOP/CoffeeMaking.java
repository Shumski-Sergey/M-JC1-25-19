package Lab6_1a_OOP;

public class CoffeeMaking extends Appliances {
    private int pressure;
    private String typeOfCoffee;

    public CoffeeMaking(String categoryName, String brand, int yearOfIssue, int power, int pressure, String typeOfCoffee) {
        super(categoryName, brand, yearOfIssue, power);
        this.pressure = pressure;
        this.typeOfCoffee = typeOfCoffee;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getTypeOfCoffee() {
        return typeOfCoffee;
    }

    public void setTypeOfCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }
}

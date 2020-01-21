package Lab6_1a_OOP;

public class CoffeeMachine extends CoffeeMaking {
    private String type;
    private boolean filter;

    public CoffeeMachine(String categoryName, String brand, int yearOfIssue, int power, int pressure, String typeOfCoffee, String type, boolean filter) {
        super(categoryName, brand, yearOfIssue, power, pressure, typeOfCoffee);
        this.type = type;
        this.filter = filter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }
}

package Lab6_1a_OOP;

public class CoffeeMaker extends CoffeeMaking {
    private String type;
    private boolean remoteControl;

    public CoffeeMaker(String categoryName, String brand, int yearOfIssue, int power, int pressure, String typeOfCoffee, String type, boolean remoteControl) {
        super(categoryName, brand, yearOfIssue, power, pressure, typeOfCoffee);
        this.type = type;
        this.remoteControl = remoteControl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }
}

package KKropa.Lab_6.Task_1;

public class Appliances implements Options {

    private String type;
    private String brand;

    public Appliances(String type, String brand) {
        this.type = type;
        this.brand = brand;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void description() {

    }
}

package riliuchik.lab6_inheritance.taskA1;

public class Appliances {
    String name;
    String brand;
    boolean socket; //true - включено в розетку, false - выключено из розетки

    public Appliances(String name, String brand, boolean socket) {
        this.name = name;
        this.brand = brand;
        this.socket = socket;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void info() {
        if (socket) System.out.println(getName() + " " + getBrand() + " (бытовая техника) - включено в розетку");
        else System.out.println(getName() + " " + getBrand() + " (бытовая техника) - выключено из розетки");
    }
}
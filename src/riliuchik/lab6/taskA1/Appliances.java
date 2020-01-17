package riliuchik.lab6.taskA1;

public abstract class Appliances implements PlugIn {
    String name;
    String brand;
    boolean socket;

    public Appliances(String name, String brand, boolean socket) {
        this.name = name;
        this.brand = brand;
        this.socket = socket;
    }

    @Override
    public void status() {
        if (socket) System.out.print("устройство включено в розетку");
        else System.out.print("устройство выключено из розетки");
    }

    public void type() {
        System.out.print("бытовая техника");
    }

    abstract void subtype();


    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
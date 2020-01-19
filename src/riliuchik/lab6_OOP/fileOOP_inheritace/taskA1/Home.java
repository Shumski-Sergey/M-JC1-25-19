package riliuchik.lab6_OOP.fileOOP_inheritace.taskA1;

public class Home extends Appliances {
    public Home(String name, String brand, boolean socket) {
        super(name, brand, socket);
    }

    @Override
    public void info() {
        if (socket) System.out.println(getName() + " " + getBrand() + " (бытовая техника для дома) - включено в розетку");
        else System.out.println(getName() + " " + getBrand() + " (бытовая техника для дома) - выключено из розетки");
    }
}
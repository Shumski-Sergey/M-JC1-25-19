package riliuchik.lab6_OOP.fileOOP_inheritace.taskA1;

public class Kitchen extends Appliances {
    public Kitchen(String name, String brand, boolean socket) {
        super(name, brand, socket);
    }

    @Override
    public void info() {
        if (socket) System.out.println(getName() + " " + getBrand() + " (бытовая техника для кухни) - включено в розетку");
        else System.out.println(getName() + " " + getBrand() + " (бытовая техника для кухни) - выключено из розетки");
    }
}
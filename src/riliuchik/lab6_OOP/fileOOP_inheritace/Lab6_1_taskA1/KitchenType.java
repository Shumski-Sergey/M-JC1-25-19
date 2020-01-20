package riliuchik.lab6_OOP.fileOOP_inheritace.Lab6_1_taskA1;

public class KitchenType extends Kitchen {
    boolean size; //true - крупная техника, false - мелкая техника

    public KitchenType(String name, String brand, boolean size, boolean socket) {
        super(name, brand, socket);
        this.size = size;
    }

    @Override
    public void info() {
        if (socket) {
            if (size)
                System.out.println(getName() + " " + getBrand() + " (крупная бытовая техника для кухни) - включено в розетку");
            else
                System.out.println(getName() + " " + getBrand() + " (мелкая бытовая техника для кухни) - включено в розетку");
        } else {
            if (size)
                System.out.println(getName() + " " + getBrand() + " (крупная бытовая техника для кухни) - выключено из розетки");
            else
                System.out.println(getName() + " " + getBrand() + " (мелкая бытовая техника для кухни) - выключено из розетки");
        }
    }
}
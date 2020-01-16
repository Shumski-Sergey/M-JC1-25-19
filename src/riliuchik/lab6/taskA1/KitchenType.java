package riliuchik.lab6.taskA1;

public class KitchenType extends Kitchen {
    boolean size;

    public KitchenType(String name, String brand, boolean size, boolean socket) {
        super(name, brand, socket);
        this.size = size;
    }

    @Override
    void size() {
        if (size) System.out.print(" крупная");
        else System.out.print(" мелкая");
    }
}
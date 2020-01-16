package riliuchik.lab6.taskA1;

public class Size extends Kitchen {
    public Size(String name, String brand, boolean size, boolean socket) {
        super(name, brand, size, socket);
    }

    @Override
    void size() {
        if (size) System.out.print(" крупная");
        else System.out.print(" мелкая");
    }
}
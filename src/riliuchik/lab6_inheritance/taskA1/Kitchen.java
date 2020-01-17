package riliuchik.lab6_inheritance.taskA1;

public abstract class Kitchen extends Appliances {
    public Kitchen(String name, String brand, boolean socket) {
        super(name, brand, socket);
    }

    @Override
    void subtype() {
        System.out.print(" для кухни");
    }

    abstract void size();
}
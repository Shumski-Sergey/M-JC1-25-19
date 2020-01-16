package riliuchik.lab6.taskA1;

public abstract class Kitchen extends Appliances {
    boolean size;

    public Kitchen(String name, String brand, boolean size, boolean socket) {
        super(name, brand, socket);
        this.size = size;
    }

    @Override
    void subtype() {
        System.out.print(" для дома");
    }

    abstract void size();
}
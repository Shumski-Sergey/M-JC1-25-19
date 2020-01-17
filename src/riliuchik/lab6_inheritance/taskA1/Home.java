package riliuchik.lab6_inheritance.taskA1;

public class Home extends Appliances {
    public Home(String name, String brand, boolean socket) {
        super(name, brand, socket);
    }

    @Override
    void subtype() {
        System.out.print(" для дома");
    }
}
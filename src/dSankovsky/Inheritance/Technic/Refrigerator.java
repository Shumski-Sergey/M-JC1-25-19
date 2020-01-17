package dSankovsky.Inheritance.Technic;

public class Refrigerator extends OversizeTechnic {
    private int storage;
    private double tall;

    public Refrigerator(String model, String color, String material, boolean powerOutlet, int storage, double tall) {
        this.setColor(color);
        this.setModel(model);
        this.setMaterial(material);
        this.setPowerOutlet(powerOutlet);
        this.setStorage(storage);
        this.setTall(tall);
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}

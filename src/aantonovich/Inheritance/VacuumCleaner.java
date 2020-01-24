package aantonovich.Inheritance;

public class VacuumCleaner extends Home {
    int power; //мощность

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public VacuumCleaner(String name, String brand, double weight, int power) {
        super(name, brand, weight);
        this.power = power;
    }
    }

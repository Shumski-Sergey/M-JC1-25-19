package aantonovich.Inheritance;

public class Washer extends Home {
    double volume;// объем загрузки

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Washer(String name, String brand, int weight, double volume) {
        super(name, brand, weight);
        this.volume = volume;
    }
}

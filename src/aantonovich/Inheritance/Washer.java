package aantonovich.Inheritance;

public class Washer extends Home {
    int volume;// объем загрузки

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Washer(String name, String brand, int weight, int power, int volume) {
        super(name, brand, weight);
        this.volume = volume;
    }
}

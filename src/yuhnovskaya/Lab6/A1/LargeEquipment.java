package yuhnovskaya.Lab6.A1;

public class LargeEquipment extends Household {
    private String type;

    public LargeEquipment(String maker, int wattege, String state, String type) {
        super(maker, wattege, state);
        this.type = type;
    }
    public  String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

